import org.testng.annotations.Test;

import java.io.IOException;


@Test
public class SubjectTest {

    @Test
    void test_primer() throws IOException {
        Double A = 5.0;
        Double B = 8.0;
        Double C = 9.0;
        Double D = 5.0;

        Subject subj = new Subject(A,B,C,D);
        subj.SaveChartsImages(A,B,C,D);
    }


}
