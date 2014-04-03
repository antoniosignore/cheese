package com.netnumeri.server.finance.utils


class SSAPage {


    public String getPage() {

        return
        "<html>\n" +
                "<head>\n" +
                "    <title>TradeGambler</title>\n" +
                "    <style>\n" +
                "\n" +
                "    </style>\n" +
                "\n" +
                "    <script type=\"text/javascript\" src=\"http://api.simile-widgets.org/timeplot/1.1/timeplot-api.js\"></script>\n" +
                "\n" +
                "   <script>\n" +
                "        var timeplot1;\n" +
                "\n" +
                "        var color3 = new Timeplot.Color('#91AA9D');\n" +
                "        var color5 = new Timeplot.Color('#193441');\n" +
                "        var blue = new Timeplot.Color('#193441');\n" +
                "\n" +
                "        var gridColor  = new Timeplot.Color('#FFE57F');\n" +
                "\n" +
                "        function onLoad() {\n" +
                "\n" +
                "            var timeGeometry = new Timeplot.DefaultTimeGeometry({\n" +
                "                gridColor: \"#FFFFFF\",\n" +
                "                min: \"2009-01-01\",\n" +
                "                axisLabelsPlacement: \"bottom\"\n" +
                "            });\n" +
                "\n" +
                "            var geometry1 = new Timeplot.DefaultValueGeometry({\n" +
                "                min: 0\n" +
                "            });\n" +
                "\n" +
                "            var geometry2 = new Timeplot.DefaultValueGeometry({\n" +
                "                min: 0\n" +
                "            });\n" +
                "\n" +
                "            var eventSource1 = new Timeplot.DefaultEventSource();\n" +
                "            var dataSource1 = new Timeplot.ColumnSource(eventSource1,1);\n" +
                "\n" +
                "            var eventSource2 = new Timeplot.DefaultEventSource();\n" +
                "            var dataSource2 = new Timeplot.ColumnSource(eventSource2,1);\n" +
                "\n" +
                "            var eventSourceFirstSSA = new Timeplot.DefaultEventSource();\n" +
                "            var dataSourceFirstSSA = new Timeplot.ColumnSource(eventSourceFirstSSA,1);\n" +
                "\n" +
                "            var plotInfo1 = [\n" +
                "                Timeplot.createPlotInfo({\n" +
                "                    id: \"stock\",\n" +
                "                    dataSource: dataSource1,\n" +
                "                    timeGeometry: timeGeometry,\n" +
                "                    valueGeometry: geometry1,\n" +
                "                    lineColor: blue,\n" +
                "                    showValues: true,\n" +
                "                    roundValues: false,\n" +
                "                    lineWidth:2\n" +
                "            }),\n" +
                "            Timeplot.createPlotInfo({\n" +
                "                    id: \"Eigen1\",\n" +
                "                    dataSource: dataSourceFirstSSA,\n" +
                "                    timeGeometry: timeGeometry,\n" +
                "                    valueGeometry: geometry2,\n" +
                "                    lineColor: color3,\n" +
                "                    showValues: true,\n" +
                "                    roundValues: false\n" +
                "            })\n" +
                "        ];\n" +
                "\n" +
                "\n" +
                "        timeplot1 = Timeplot.create(document.getElementById(\"timeplot1\"), plotInfo1);\n" +
                "        timeplot1.loadText(\"/home/antonio/timeplot/stock.txt\", \" \", eventSource1);\n" +
                "        timeplot1.loadText(\"/home/antonio/timeplot/SSA-0.txt\", \" \", eventSourceFirstSSA);\n" +
                "        }\n" +
                "\n" +
                "        var resizeTimerID = null;\n" +
                "        function onResize() {\n" +
                "            if (resizeTimerID == null) {\n" +
                "                resizeTimerID = window.setTimeout(function() {\n" +
                "                    resizeTimerID = null;\n" +
                "                    if (timeplot1) timeplot1.repaint();\n" +
                "                }, 0);\n" +
                "            }\n" +
                "        }\n" +
                "    </script>\n" +
                "  </head>\n" +
                "  <body onload=\"onLoad();\" onresize=\"onResize();\">\n" +
                "\n" +
                "    <div id=\"content\">\n" +
                "        <div id=\"timeplot1\" style=\"height: 400px\" class=\"timeplot\"></div>\n" +
                "    </div>\n" +
                "\n" +
                "  </body>\n" +
                "</html>"
    }
}
