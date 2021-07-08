package test.java.java11;

import java11.Features;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.List;

public class FeatureTest {
    private Features features;

    @Before
    public void init() throws Exception {
         features = new Features();
    }

    @Test
    public void passed_test() {

        Assert.assertTrue(true);
    }

    @Test
    public void failed_test() {
        Assert.fail();
    }

    @Test
    public void strings() {
        String str = " str1 \n \n str2 \n str3.";
        List<String> lines = features.stringsWithoutBlanks(str);

        assert (lines).contains("str1");
        Assert.assertFalse(lines.contains("\n"));
        Assert.assertFalse(lines.contains(" "));
        Assert.assertEquals(3, lines.size());
        Assert.assertNotSame(lines.get(0) + lines.get(1) + lines.get(2), str);
    }

    @Test
    public void predicate() {
        List<String> list = Arrays.asList(" ", " \n", "str1\n str2\n str3");
        List<String> listOFStringWithoutBlanks = features.predicate(list);
        Assert.assertNotSame(list, listOFStringWithoutBlanks);
        Assert.assertFalse(listOFStringWithoutBlanks.contains("\n"));
        Assert.assertFalse(listOFStringWithoutBlanks.contains(null));
    }

}
