package java11;
import java.util.List;
import java.util.stream.Collectors;
public class Strings {
    public static void main(String[] args) {
        String str2 = " str1 \n \n str2 \n str3.";
        List<String> lines = str2.lines().filter(line -> !line.isBlank()).map(String::strip)
                .collect(Collectors.toList());
        assert (lines).contains("str1");
        System.out.println(lines);
    }
}