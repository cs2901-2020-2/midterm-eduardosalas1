import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;


public class BarChartMonitor extends ApplicationFrame {

    public BarChartMonitor(String applicationTitle, String chartTitle, Double A, Double B, Double C, Double D) throws IOException {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Categoria",
                "Puntaje",
                createDataset(A, B, C, D),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
        File BarChart = new File("Barchart.jpeg");
        ChartUtils.saveChartAsJPEG(BarChart,barChart,640,480);

    }

    public BarChartMonitor(String title) {
        super(title);
    }

    private CategoryDataset createDataset(Double A, Double B, Double C, Double D) {
        final String RegionA = "A";
        final String RegionB = "B";
        final String RegionC = "C";
        final String RegionD = "D";
        final String simple = "Simple";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.addValue(A, RegionA, simple);

        dataset.addValue(B, RegionB, simple);

        dataset.addValue(C, RegionC, simple);

        dataset.addValue(D, RegionD, simple);

        return dataset;
    }

}
