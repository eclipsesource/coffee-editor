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
import { BaseWidget, Message, PreferenceSchemaProvider } from '@theia/core/lib/browser';
import { inject, injectable, postConstruct } from 'inversify';
import * as React from 'react';
import * as ReactDOM from 'react-dom';

@injectable()
export class PreferenceEditorContainer extends BaseWidget {
    static ID = 'org.eclipse.emfcloud.theia.preferences.editor';

    constructor(
        @inject(PreferenceSchemaProvider) protected readonly schemaProvider: PreferenceSchemaProvider) {
        super();
    }

    @postConstruct()
    protected init(): void {
        this.id = PreferenceEditorContainer.ID;
        this.title.label = 'Custom Preferences';
        this.title.caption = this.title.label;
        this.title.closable = true;
    }

    protected async onAfterAttach(msg: Message): Promise<void> {
        const cs = this.schemaProvider.getCombinedSchema();
        ReactDOM.render(<div><h1>Custom Preference Test</h1><p>{JSON.stringify(cs)}</p></div>, this.node);

        super.onAfterAttach(msg);
        // this.onInitEmitter.fire(undefined);
    }
}
