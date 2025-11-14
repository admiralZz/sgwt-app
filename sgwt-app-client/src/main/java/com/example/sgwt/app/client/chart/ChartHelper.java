package com.example.sgwt.app.client.chart;

public class ChartHelper {
    public static native void renderChart() /*-{
        var ctx = $wnd.document.getElementById('myChart').getContext('2d');
        new $wnd.Chart(ctx, {
            type: 'bar',
            data: {
                labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                datasets: [{
                    label: 'Количество',
                    data: [12, 19, 3, 5, 2, 3],
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: { beginAtZero: true }
                }
            }
        });
    }-*/;
}
