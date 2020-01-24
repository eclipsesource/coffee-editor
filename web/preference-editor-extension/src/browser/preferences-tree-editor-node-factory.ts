/*!
 * Copyright (C) 2019 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
import { ILogger, LogLevel } from '@theia/core';
import { inject, injectable } from 'inversify';
import { TreeEditor } from 'theia-tree-editor';
import { v4 } from 'uuid';

import { PreferencesTreeLabelProvider } from './preferences-tree-label-provider';

@injectable()
export class PreferencesTreeNodeFactory implements TreeEditor.NodeFactory {

    constructor(
        @inject(TreeEditor.LabelProvider) private readonly labelProvider: PreferencesTreeLabelProvider,
        @inject(ILogger) private readonly logger: ILogger) {
    }

    mapDataToNodes(treeData: TreeEditor.TreeData): TreeEditor.Node[] {
        const data = treeData.data;
        if (!data) {
            this.logger.log(LogLevel.ERROR, 'No valid data provided!');
            return undefined;
        }
        if (typeof data.properties === 'object' && data.properties !== null) {
            // extract root properties
            // ['foo.bar', 'foo.bar2', 'bar.foo'] => ['foo', 'bar']
            // create nodes per root property including fake schema
            // add nodes to parent and return

            const nodes = Object.keys(data.properties).reduce((acc, cur) => {
                const indexOfDot = cur.indexOf('.');
                if (indexOfDot !== -1) {
                    const dotSplit = cur.substring(0, indexOfDot);
                    const afterDot = cur.substring(indexOfDot + 1);
                    if (!acc.hasOwnProperty(dotSplit)) {
                        const newNode: TreeEditor.Node = {
                            ...this.defaultNode(),
                            name: this.labelProvider.getName({ name: dotSplit }),
                            jsonforms: {
                                type: undefined,
                                // in the pref editor the data is used as schema
                                data: {
                                    type: 'object',
                                    properties: {}
                                },
                                property: dotSplit
                            }
                        };
                        acc[dotSplit] = newNode;
                    }
                    const interNode = acc[dotSplit];
                    interNode.jsonforms.data.properties[afterDot] = data.properties[cur];
                }
                return acc;
            }, {});
            return Object.values(nodes);
        }
        return [];
    }
    mapData(data: any, parent?: TreeEditor.Node, property?: string, indexOrKey?: number | string): TreeEditor.Node {
        return undefined;
    }

    hasCreatableChildren(node: TreeEditor.Node): boolean {
        // TODO implement hasCreatableChildren if necessary
        return false;
    }

    protected defaultNode(): Pick<
        TreeEditor.Node,
        'id' | 'expanded' | 'selected' | 'parent' | 'decorationData' | 'children'
    > {
        return {
            id: v4(),
            expanded: false,
            selected: false,
            parent: undefined,
            decorationData: {},
            children: []
        };
    }

    protected getType(data: any): string {
        // TODO: implement type determination if needed
        return undefined;
    }

}
