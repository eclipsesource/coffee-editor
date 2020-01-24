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
import { PreferenceProvider, PreferenceSchemaProvider, PreferenceScope, Title, Widget } from '@theia/core/lib/browser';
import { ILogger } from '@theia/core/lib/common';
import { WorkspaceService } from '@theia/workspace/lib/browser/workspace-service';
import { inject, injectable, named } from 'inversify';
import {
  AddCommandProperty,
  JsonFormsTreeEditorWidget,
  JsonFormsTreeWidget,
  JSONFormsWidget,
  TreeEditor,
} from 'theia-tree-editor';

@injectable()
export class PreferencesTreeEditorWidget extends JsonFormsTreeEditorWidget {

  constructor(
    @inject(JsonFormsTreeWidget)
    readonly treeWidget: JsonFormsTreeWidget,
    @inject(JSONFormsWidget)
    readonly formWidget: JSONFormsWidget,
    @inject(WorkspaceService)
    readonly workspaceService: WorkspaceService,
    @inject(ILogger) readonly logger: ILogger,
    @inject(PreferenceSchemaProvider)
    protected readonly schemaProvider: PreferenceSchemaProvider,
    @inject(PreferenceProvider) @named(PreferenceScope.User)
    protected readonly provider: PreferenceProvider) {
    super(
      treeWidget,
      formWidget,
      workspaceService,
      logger,
      PreferencesTreeEditorWidget.WIDGET_ID
    );

    this.instanceData = schemaProvider.getCombinedSchema();
    this.treeWidget.setData({ error: false, data: this.instanceData });
  }

  protected handleFormUpdate(data: any, node: TreeEditor.Node): void {
    // Set the preference values for the given node. This automatically saves the change
    if (data && node.jsonforms.data) {
      this.setPreferences(data, node);
    }
  }

  async setPreferences(data: any, node: TreeEditor.Node) {
    for (const key of Object.keys(node.jsonforms.data.properties)) {
      // Need to wait for each set to avoid out-of-sync filesystem
      // TODO this could cause bad performance.
      await this.provider.setPreference(node.jsonforms.property + '.' + key, data[key]);
    }
  }

  protected deleteNode(node: Readonly<TreeEditor.Node>): void {
    // nothing to do because no preferences can be deleted in this editor.
  }

  protected addNode({ node, type, property }: AddCommandProperty): void {
    // nothing to do because no new preferences can be added in this editor.
  }

  dispose() {
    super.dispose();
  }

  protected configureTitle(title: Title<Widget>): void {
    title.label = 'Preferences';
    title.caption = JsonFormsTreeEditorWidget.WIDGET_LABEL;
    title.closable = true;
    title.iconClass = 'fa fa-cog black';
  }
}
export namespace PreferencesTreeEditorWidget {
  export const WIDGET_ID = 'org.eclipse.emfcloud.theia.preferences.editor';
}
