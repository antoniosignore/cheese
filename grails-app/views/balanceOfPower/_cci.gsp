<%@ page import="com.netnumeri.server.finance.ta.Indicator; com.netnumeri.server.utils.StockUtils" %>

<script class="code" language="javascript" type="text/javascript">
    $(document).ready(function () {
        var plot2 = $.jqplot('chart2-${StockUtils.lastDate(stockInstance)}',
                [   normalized${StockUtils.lastDate(stockInstance)},
                    bop${StockUtils.lastDate(stockInstance)}], {
                    seriesDefaults: {yaxis: 'yaxis'},
                    title: {
                        text: '${StockUtils.dateTitle(stockInstance)}',
                        show: true
                    }, axes: {
                        xaxis: {
                            renderer: $.jqplot.DateAxisRenderer,
                            tickOptions: {formatString: '%b %e'}
                        },
                        yaxis: {
                            tickOptions: {formatString: '%#.5f'}
                        }
                    },
                    series: [
                        {
                            lineWidth: 1, showMarker: false,
                            color: '#000000',
                            showLine: true
                        },
                        {
                            lineWidth: 1, showMarker: false,
                            showLine: true
                        },
                        {
                            lineWidth: 1, showMarker: false,
                            showLine: true
                        },
                        {
                            lineWidth: 1, showMarker: false,
                            showLine: true
                        },
                        {
                            lineWidth: 1,
                            color: 'blue',
                            showMarker: false,
                            showLine: true
                        }
                    ],
                    highlighter: {
                        show: true
                    },
                    cursor: {
                        show: true
                    },
                    grid: {
                        borderColor: 'transparent',
                        shadow: false,
                        drawBorder: false
                    }
                });
    });

    normalized${StockUtils.lastDate(stockInstance)} = ${stockInstance.indicators.get("normalized").jqPlot};
    bop${StockUtils.lastDate(stockInstance)} = ${stockInstance.indicators.get("bop").jqPlot};

</script>

<div class="item" id="chart2-${StockUtils.lastDate(stockInstance)}" style="height:600px; width:100%;"></div>
