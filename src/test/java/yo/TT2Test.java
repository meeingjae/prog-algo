package yo;

import org.junit.jupiter.api.Test;

public class TT2Test {

    @Test
    void name() {
        int leave = 4;
        String day = "FRI";
        int[] holidays = {6,21,23,27,28};

        int result = TT2.solution(leave,day,holidays);
    }
}
