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
import { JsonSchema, UISchemaElement } from '@jsonforms/core';
import { PreferenceProvider, PreferenceScope } from '@theia/core/lib/browser';
import { inject, injectable, named } from 'inversify';
import { TreeEditor } from 'theia-tree-editor';

@injectable()
export class PreferenceModelService implements TreeEditor.ModelService {
    constructor(@inject(PreferenceProvider) @named(PreferenceScope.User) private provider: PreferenceProvider) { }

    getDataForNode(node: TreeEditor.Node): any {
        // const prefName = node.jsonforms.data.name;
        // this.provider.onDidPreferencesChanged(e => console.log(e));
        // return this.provider.getPreferences();
        const prefs = this.provider.getPreferences();
        const subPrefs = Object.keys(prefs).filter(key => key.startsWith(node.jsonforms.property))
            .reduce((acc, key) => {
                acc[key.substr(node.jsonforms.property.length + 1)] = prefs[key];
                return acc;
            }, {});
        // const result = {};
        // result[node.name] = subPrefs;
        return subPrefs;
    }

    getSchemaForNode(node: TreeEditor.Node): JsonSchema {
        // TODO implement method
        return node.jsonforms.data;
    }

    getUiSchemaForNode(node: TreeEditor.Node): UISchemaElement {
        // TODO implement method
        // create custom vertical layout with controls. The scope must be derived from node.name + node.jsonforms.data.properties
        // const result = Generate.uiSchema(node.jsonforms.data) as VerticalLayout;
        // result.elements.forEach(e => {
        //     const control = e as ControlElement;
        //     control.scope = control.scope.replace('#/properties/', '#/properties/' + node.name + '.');
        // });
        // return result;
        return undefined;
    }

    getChildrenMapping(): Map<string, TreeEditor.ChildrenDescriptor[]> {
        // TODO implement method
        return undefined;
    }

    getNameForType(type: string): string {
        // TODO implement method?
        return type;
    }
}
