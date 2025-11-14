package com.example.sgwt.app.client.echart;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.ScriptInjector;

public class EChartLoader {
    public interface ChartLoadedCallback {
        void onLoaded();
    }
    public static void load(ChartLoadedCallback callback) {
        ScriptInjector.fromUrl("https://cdn.jsdelivr.net/npm/echarts/dist/echarts.min.js")
                .setWindow(ScriptInjector.TOP_WINDOW)
                .setCallback(new Callback<Void, Exception>() {
                    @Override
                    public void onFailure(Exception e) {
                        com.smartgwt.client.util.SC.warn("Не удалось загрузить ECharts.js");
                    }

                    @Override
                    public void onSuccess(Void unused) {
                        callback.onLoaded();
                    }
                })
                .inject();
    }
}
