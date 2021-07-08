package java11;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Strings {
    @Test
    public void strings() {
        String str2 = " str1 \n \n str2 \n str3.";
        List<String> lines = str2.lines().filter(line -> !line.isBlank()).map(String::strip)
                .collect(Collectors.toList());
        assert (lines).contains("str1");
        Assert.assertFalse(lines.contains("\n"));
        Assert.assertFalse(lines.contains(" "));
        Assert.assertEquals(3, lines.size());
        Assert.assertNotSame(lines.get(0)+lines.get(1)+lines.get(2), str2);
    }
}