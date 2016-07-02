package evilautocorrectprank;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static String autocorrect(String input) {
        String output = input;

        List<String> regexToReplace = new ArrayList<String>();
        regexToReplace.add("\\bu\\b");
        regexToReplace.add("(?i)\\bYO[U]+\\b");

        for (String regex : regexToReplace){
            output = output.replaceAll("(?i)" + regex, "your sister");
        }

        return output;
    }
}
