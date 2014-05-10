<%@ page import="com.netnumeri.server.finance.ta.Indicator; com.netnumeri.server.utils.StockUtils" %>

<script class="code" language="javascript" type="text/javascript">
    $(document).ready(function () {
        var plot2 = $.jqplot('chart', [ohlc], {
            seriesDefaults: {yaxis: 'yaxis'},
            axes: {
                xaxis: {
                    renderer: $.jqplot.DateAxisRenderer,
                    tickOptions: {formatString: '%b %e'}
                },
                yaxis: {
                    tickOptions: {formatString: '%d'}
                }
            },
            // To make a candle stick chart, set the "candleStick" option to true.
            series: [
                {
                    renderer: $.jqplot.OHLCRenderer,
                    rendererOptions: {
                        candleStick: true,
                        upBodyColor: 'black',
                        downBodyColor: 'black',
                        fillUpBody: false,
                        fillDownBody: true
                    },
                    highlighter: {
                        showMarker: false,
                        pointLabels: { show: true, location: 's', ypadding: 3 },
                        tooltipAxes: 'xy',
                        yvalues: 4,
                        formatString: '<table class="jqplot-highlighter"> \
                                      <tr><td>date:</td><td>%s</td></tr> \
                                      <tr><td>open:</td><td>%s</td></tr> \
                                      <tr><td>hi:</td><td>%s</td></tr> \
                                      <tr><td>low:</td><td>%s</td></tr> \
                                      <tr><td>close:</td><td>%s</td></tr>\
                                  </table>'
                    }
                },
                {
                    showLine: false,
                    markerOptions: { size: 10, style: "diamonds", color: 'blue' }
                },
                {
                    showLine: false,
                    markerOptions: { size: 10, style: "filledCircle", color: 'red' }
                }
                /*                ,
                 {
                 lineWidth:1, showMarker: false,
                 showLine:true
                 },
                 {
                 lineWidth:1, showMarker: false,
                 showLine:true
                 }
                 */
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

    ohlc = ${StockUtils.candleStickPlot(stockInstance)}
    $(window).resize(function () {
        plot2.replot({ resetAxes: true });
    });
</script>

<div id="chart" style="height:150px; width:100%;"></div>


