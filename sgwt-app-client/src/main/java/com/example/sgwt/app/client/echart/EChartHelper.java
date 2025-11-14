package com.example.sgwt.app.client.echart;

public class EChartHelper {
    public static native void renderChart() /*-{
        var chartDom = $wnd.document.getElementById('myChart');
        var myChart = $wnd.echarts.init(chartDom);

        var option = {
            title: {
                text: 'Продажи по месяцам'
            },
            tooltip: {},
            xAxis: {
                type: 'category',
                data: ['Jan', 'Feb', 'Mar', 'Apr', 'May']
            },
            yAxis: {
                type: 'value'
            },
            series: [{
                data: [150, 230, 224, 218, 135],
                type: 'line'
            }]
        };

        myChart.setOption(option);
    }-*/;
}
