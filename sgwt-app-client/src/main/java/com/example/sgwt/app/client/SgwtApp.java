package com.example.sgwt.app.client;

import com.example.sgwt.app.bridge.client.GreetingService;
import com.example.sgwt.app.bridge.client.GreetingServiceAsync;
import com.example.sgwt.app.client.echart.EChartHelper;
import com.example.sgwt.app.client.echart.EChartLoader;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.layout.VLayout;

public final class SgwtApp implements EntryPoint {
    private IButton button = new IButton("Test");
    private static final GreetingServiceAsync service = GWT.create(GreetingService.class);

    public void onModuleLoad() {
        VLayout layout = new VLayout();

        layout.addMember(button);

        HTMLFlow chartFlow = new HTMLFlow();
        chartFlow.setContents("<canvas id='myChart' width='600' height='300'></canvas>");
        layout.addMember(chartFlow);

        layout.draw();

        EChartLoader.load(() -> {
            EChartHelper.renderChart();
        });
    }

}