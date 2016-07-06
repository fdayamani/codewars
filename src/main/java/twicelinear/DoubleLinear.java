package twicelinear;

import org.apache.commons.collections4.list.SetUniqueList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.apache.commons.collections4.list.SetUniqueList.setUniqueList;

public class DoubleLinear {

    public static int dblLinear (int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        for (int i = 0; i < n; i++) {
            sequence.add(2  * sequence.get(i) + 1);
            sequence.add(3  * sequence.get(i) + 1);
        }
        Collections.sort(sequence);
        SetUniqueList<Integer> removedDuplicates = setUniqueList(sequence);
        return removedDuplicates.get(n);
    }
}
