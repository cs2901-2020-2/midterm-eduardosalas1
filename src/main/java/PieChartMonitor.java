import javax.swing.JPanel;

import org.jfree.chart.*;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.*;
import org.jfree.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.io.File;
import java.io.IOException;

public class PieChartMonitor extends ApplicationFrame {


    public PieChartMonitor(String title,Double A, Double B, Double C, Double D) throws IOException {
        super(title);
        setContentPane(createDemoPanel(A,B,C,D));
    }

    public static PieDataset createDataset(Double A, Double B, Double C, Double D) {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue( "A" , A );
        dataset.setValue( "B" , B);
        dataset.setValue( "C" , C);
        dataset.setValue( "D" , D);
        return dataset;
    }

    public static JFreeChart createChart( PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(
                "PieChart",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        return chart;
    }

    public static JPanel createDemoPanel(Double A,Double B,Double C,Double D) throws IOException {
        JFreeChart chart = createChart(createDataset(A,B,C,D) );
        File pieChart = new File("PieChart.jpeg");
        ChartUtils.saveChartAsJPEG(pieChart, chart , 640, 480 );
        return new ChartPanel( chart );
    }
}
