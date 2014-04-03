package com.dtmc.graphics;

public class TimeSeriesUtils {

    public TimeSeriesUtils() {
    }

//    public static FinGraph getGraph(com.netnumeri.server.finance.beans.TimeSeries serie, int w, int h, int weight, boolean isLogScale) {
//        return getGraph(serie, 0, w, h, weight, isLogScale);
//    }
//
//    public static FinGraph getGraph(com.netnumeri.server.finance.beans.TimeSeries serie, int w, int h, int weight) {
//        return getGraph(serie, 0, w, h, weight, false);
//    }
//
//    public static FinGraph getGraph(com.netnumeri.server.finance.beans.TimeSeries serie) {
//        return getGraph(serie, 0, 800, 200, 1, false);
//    }
//
//    public static FinGraph getGraph(com.netnumeri.server.finance.beans.TimeSeries serie, int RowCount, int w, int h, int weight, boolean isLogScale) {
//        GraphFactory graphfactory = GraphFactory.getInstance();
//        TimeSerieGraph graph = (TimeSerieGraph) graphfactory.newGraph("timeserie", w, h, weight);
//        TimeSeriesCollection dataset = getDataset(serie, RowCount);
//        graph.setDatasetCollection(dataset);
//        graph.setTitle(serie.getName());
//        graph.createChart();
//        graph.getChart().setBorderVisible(false);
//        graph.getChart().setBackgroundPaint(Color.white);
//        graph.generateImage();
//        return graph;
//    }
//
//    public static FinGraph getGraph(com.netnumeri.server.finance.beans.TimeSeries serie, int RowCount, int w, int h, int weight, boolean isLogScale, TransactionSeries tseries) {
//        GraphFactory graphfactory = GraphFactory.getInstance();
//        TimeSerieGraph graph = (TimeSerieGraph) graphfactory.newGraph("timeserie", w, h, weight);
//        TimeSeriesCollection dataset = getDataset(serie, RowCount);
//        graph.setDatasetCollection(dataset);
//        graph.setTitle(serie.getName());
//        graph.createChart();
//        graph.getChart().setBorderVisible(false);
//        graph.getChart().setBackgroundPaint(Color.white);
//        for (int j = 0; j < tseries.getNTransactions(); j++) {
//            Transaction t = tseries.getTransaction(j);
//            GraphicsUtils.addDateMarker(graph, t);
//        }
//
//        graph.generateImage();
//        return graph;
//    }
//
//    public static TimeSeriesCollection getDataset(com.netnumeri.server.finance.beans.TimeSeries serie, int RowCount) {
//        SegmentedTimeline timeline = SegmentedTimeline.newMondayThroughFridayTimeline();
//        TimeSeries ts = new TimeSeries("time xyseries", Day.class);
//        org.jfree.chart.axis.SegmentedTimeline.Segment segment = null;
//        try {
//            for (int i = serie.getFirstIndex(); i <= serie.getLastIndex(); i++) {
//                double v = serie.data.get(RowCount, i);
//                if (!Double.isNaN(v)) {
//                    TDay dt = serie.getDate(i);
//                    ts.add(new Day(dt.getDate(), dt.getMonth() + 1, dt.getYear()), v);
//                }
//            }
//
//        } catch (Exception e) {
//        }
//        TimeSeriesCollection dataset = new TimeSeriesCollection();
//        dataset.addSeries(ts);
//        return dataset;
//    }
//
//    public static FinGraph getXYGraph(com.netnumeri.server.finance.beans.TimeSeries serie, int w, int h, int weight, boolean isLogScale) {
//        return getXYGraph(serie, 0, w, h, weight, isLogScale);
//    }
//
//    public static FinGraph getXYGraph(com.netnumeri.server.finance.beans.TimeSeries serie, int w, int h, int weight) {
//        return getXYGraph(serie, 0, w, h, weight, true);
//    }
//
//    public static FinGraph getXYGraph(com.numhero.shared.finance.beans.TimeSeries serie, int RowCount, int w, int h, int weight, boolean isLogScale) {
//        GraphFactory graphfactory = GraphFactory.getInstance();
//        XYGraph graph = (XYGraph) graphfactory.newGraph("XY", w, h, weight);
//        XYSeriesCollection dataset = getXYDataset(serie, RowCount);
//        graph.setDataset(dataset);
//        graph.setTitle(serie.getName());
//        graph.createChart();
//        graph.getChart().setBorderVisible(false);
//        graph.generateImage();
//        return graph;
//    }
//
//    private static XYSeriesCollection getXYDataset(com.netnumeri.server.finance.beans.TimeSeries serie, int RowCount) {
//        XYSeries xyseries = new XYSeries(serie.getName());
//        for (int i = serie.getFirstIndex(); i <= serie.getLastIndex(); i++) {
//            double v = serie.data.get(RowCount, i);
//            if (!Double.isNaN(v))
//                xyseries.add(i, v);
//        }
//
//        XYSeriesCollection dataset = new XYSeriesCollection();
//        dataset.addSeries(xyseries);
//        return dataset;
//    }
}