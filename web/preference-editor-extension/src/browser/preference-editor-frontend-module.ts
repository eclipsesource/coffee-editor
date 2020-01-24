/********************************************************************************
 * Copyright (C) 2018 Ericsson and others.
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
 ********************************************************************************/
import { bindViewContribution, PreferenceProvider, PreferenceScope, WidgetFactory } from '@theia/core/lib/browser';
import { ContainerModule } from 'inversify';
import { createBasicTreeContainter } from 'theia-tree-editor';

import { UserPreferenceProvider } from './duplicate/user-preference-provider';
import { PreferenceEditorContribution } from './preference-editor-contribution';
import { PreferenceModelService } from './preference-editor-model-service';
import { PreferencesTreeNodeFactory } from './preferences-tree-editor-node-factory';
import { PreferencesTreeEditorWidget } from './preferences-tree-editor-widget';
import { PreferencesTreeLabelProvider } from './preferences-tree-label-provider';

export default new ContainerModule((bind, unbind, _isBound, _rebind) => {
    bindViewContribution(bind, PreferenceEditorContribution);

    unbind(PreferenceProvider);
    bind(PreferenceProvider).to(UserPreferenceProvider).inSingletonScope().whenTargetNamed(PreferenceScope.User);

    bind(WidgetFactory).toDynamicValue(({ container }) => ({
        id: PreferencesTreeEditorWidget.WIDGET_ID,
        // createWidget: () => container.get(PreferencesTreeEditorWidget)
        createWidget: () => {
            const treeContainer = createBasicTreeContainter(
                container,
                PreferencesTreeEditorWidget,
                PreferenceModelService,
                PreferencesTreeLabelProvider,
                PreferencesTreeNodeFactory
            );

            return treeContainer.get(PreferencesTreeEditorWidget);
        }
    }));
});
