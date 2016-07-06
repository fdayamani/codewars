package twicelinear;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static twicelinear.DoubleLinear.dblLinear;


public class DoubleLinearTest {

    private static void testElementOfSequence(int element, int value) {
        assertThat(dblLinear(element)).isEqualTo(value);
    }

    @Test public void
    elementZeroOfSequence_is1() {
        testElementOfSequence(0, 1);
    }

    @Test public void
    elementOne_Is3() {
        testElementOfSequence(1, 3);
    }

    @Test
    @Ignore
    public void test() {
        System.out.println("Fixed Tests dblLinear");
        testElementOfSequence(10, 22);
        testElementOfSequence(20, 57);
        testElementOfSequence(30, 91);
        testElementOfSequence(50, 175);

    }
}


