package twicelinear;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static twicelinear.DoubleLinear.dblLinear;

import org.junit.Ignore;
import org.junit.Test;


public class DoubleLinearTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test public void
    elementZeroOfSequence_is1() {
        assertThat(dblLinear(0)).isEqualTo(1);
    }

    @Test
    @Ignore
    public void test() {
        System.out.println("Fixed Tests dblLinear");
        testing(dblLinear(10), 22);
        testing(dblLinear(20), 57);
        testing(dblLinear(30), 91);
        testing(dblLinear(50), 175);

    }
}


