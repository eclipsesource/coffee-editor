/********************************************************************************
 * Copyright (c) 2019-2021 EclipseSource, Christian W. Damus, and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
import '../css/diagram.css';
import 'balloon-css/balloon.min.css';
import 'sprotty/css/edit-label.css';

import {
    boundsModule,
    buttonModule,
    configureModelElement,
    ConsoleLogger,
    defaultGLSPModule,
    defaultModule,
    DeleteElementContextMenuItemProvider,
    DiamondNodeView,
    edgeLayoutModule,
    editLabelFeature,
    ExpandButtonView,
    expandModule,
    exportModule,
    fadeModule,
    GLSP_TYPES,
    glspCommandPaletteModule,
    glspContextMenuModule,
    glspDecorationModule,
    glspEditLabelModule,
    GLSPGraph,
    glspHoverModule,
    glspMouseToolModule,
    glspSelectModule,
    glspServerCopyPasteModule,
    GridSnapper,
    HtmlRoot,
    HtmlRootView,
    labelEditModule,
    labelEditUiModule,
    layoutCommandsModule,
    LogLevel,
    markerNavigatorModule,
    modelHintsModule,
    modelSourceModule,
    navigationModule,
    NoOverlapMovmentRestrictor,
    openModule,
    overrideViewerOptions,
    paletteModule,
    PreRenderedElement,
    PreRenderedView,
    RevealNamedElementActionProvider,
    routingModule,
    SButton,
    SCompartment,
    SCompartmentView,
    SEdge,
    SGraphView,
    SLabel,
    SLabelView,
    SRoutingHandle,
    SRoutingHandleView,
    toolFeedbackModule,
    toolsModule,
    TYPES,
    validationModule,
    viewportModule,
    zorderModule
} from '@eclipse-glsp/client';
import { Container, ContainerModule } from 'inversify';

import { directTaskEditor } from './direct-task-editing/di.config';
import { ActivityNode, Icon, TaskNode, WeightedEdge } from './model';
import { ForkOrJoinNodeView, IconView, TaskNodeView, WeightedEdgeView, WorkflowEdgeView } from './workflow-views';

const workflowDiagramModule = new ContainerModule(
    (bind, unbind, isBound, rebind) => {
        rebind(TYPES.ILogger)
            .to(ConsoleLogger)
            .inSingletonScope();
        rebind(TYPES.LogLevel).toConstantValue(LogLevel.warn);
        bind(GLSP_TYPES.IMovementRestrictor)
            .to(NoOverlapMovmentRestrictor)
            .inSingletonScope();
        bind(TYPES.ISnapper).to(GridSnapper);
        bind(TYPES.ICommandPaletteActionProvider).to(
            RevealNamedElementActionProvider
        );
        bind(TYPES.IContextMenuItemProvider).to(
            DeleteElementContextMenuItemProvider
        );
        const context = { bind, unbind, isBound, rebind };
        configureModelElement(context, 'graph', GLSPGraph, SGraphView);
        configureModelElement(
            context,
            'task:automated',
            TaskNode,
            TaskNodeView
        );
        configureModelElement(context, 'task:manual', TaskNode, TaskNodeView);
        configureModelElement(context, 'label:heading', SLabel, SLabelView, {
            enable: [editLabelFeature]
        });
        configureModelElement(
            context,
            'comp:comp',
            SCompartment,
            SCompartmentView
        );
        configureModelElement(
            context,
            'comp:header',
            SCompartment,
            SCompartmentView
        );
        configureModelElement(context, 'label:icon', SLabel, SLabelView);
        configureModelElement(context, 'html', HtmlRoot, HtmlRootView);
        configureModelElement(
            context,
            'pre-rendered',
            PreRenderedElement,
            PreRenderedView
        );
        configureModelElement(
            context,
            'button:expand',
            SButton,
            ExpandButtonView
        );
        configureModelElement(
            context,
            'routing-point',
            SRoutingHandle,
            SRoutingHandleView
        );
        configureModelElement(
            context,
            'volatile-routing-point',
            SRoutingHandle,
            SRoutingHandleView
        );
        configureModelElement(context, 'edge', SEdge, WorkflowEdgeView);
        configureModelElement(
            context,
            'edge:weighted',
            WeightedEdge,
            WeightedEdgeView
        );
        configureModelElement(context, 'icon', Icon, IconView);
        configureModelElement(
            context,
            'activityNode:merge',
            ActivityNode,
            DiamondNodeView
        );
        configureModelElement(
            context,
            'activityNode:decision',
            ActivityNode,
            DiamondNodeView
        );
        configureModelElement(
            context,
            'activityNode:fork',
            ActivityNode,
            ForkOrJoinNodeView
        );
        configureModelElement(
            context,
            'activityNode:join',
            ActivityNode,
            ForkOrJoinNodeView
        );
    }
);

export default function createContainer(widgetId: string): Container {
    const container = new Container();

    container.load(
        validationModule,
        defaultModule,
        glspMouseToolModule,
        defaultGLSPModule,
        glspSelectModule,
        boundsModule,
        viewportModule,
        toolsModule,
        glspHoverModule,
        fadeModule,
        exportModule,
        expandModule,
        openModule,
        buttonModule,
        modelSourceModule,
        labelEditModule,
        labelEditUiModule,
        glspEditLabelModule,
        workflowDiagramModule,
        toolFeedbackModule,
        modelHintsModule,
        glspContextMenuModule,
        glspServerCopyPasteModule,
        glspCommandPaletteModule,
        paletteModule,
        routingModule,
        glspDecorationModule,
        edgeLayoutModule,
        zorderModule,
        layoutCommandsModule,
        directTaskEditor, navigationModule, markerNavigatorModule
    );

    overrideViewerOptions(container, {
        baseDiv: widgetId,
        hiddenDiv: widgetId + '_hidden',
        needsClientLayout: true
    });

    return container;
}
