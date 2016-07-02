package evilautocorrectprank;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class AutocorrectTest {
    @Parameters({"u"
            , "U"
            , "you"
            , "YOU"
            , "YOUUUUU"
    })
    @Test public void
    outputsOriginalString_WithInputReplaced(String input) {
        String original = createMessageAbout(input);

        assertThat(Kata.autocorrect(original)).isEqualTo(createMessageAbout("your sister"));
    }

    private String createMessageAbout(String input) {
        return String.format("I love %s", input);
    }


    @Test
    public void testApply() {
        String[] inputs = new String[] {
                "u",
                "you",
                "Youuuuu",
                "youtube"
        };

        String[] outputs = new String[] {
                "your sister",
                "your sister",
                "your sister",
                "youtube"
        };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i], Kata.autocorrect(inputs[i]));
        }
    }
}
