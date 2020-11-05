import java.io.IOException;
import java.util.*;

public class Subject {

    private Double RegionA;
    private Double RegionB;
    private Double RegionC;
    private Double RegionD;

    PieChartMonitor Piechart = null;
    BarChartMonitor BarChart = null;

    public Subject(Double A, Double B, Double C, Double D){

        this.RegionA = A;
        this.RegionB = B;
        this.RegionC = C;
        this.RegionD = D;

    }

    public void SaveChartsImages (Double A, Double B, Double C, Double D) throws IOException {

        this.Piechart = new PieChartMonitor("Piechart",A,B,C,D);
        this.BarChart = new BarChartMonitor("App Chart", "BarChart", A, B, C, D);
    }


}
