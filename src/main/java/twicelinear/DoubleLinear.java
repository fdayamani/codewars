package twicelinear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleLinear {

    public static int dblLinear (int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        for (int i = 0; i < n; i++) {
            sequence.add(2  * sequence.get(i) + 1);
            sequence.add(3  * sequence.get(i) + 1);
        }
        Collections.sort(sequence);
        return sequence.get(n);
    }
}
