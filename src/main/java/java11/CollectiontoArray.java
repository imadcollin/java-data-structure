package java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class CollectiontoArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("first", "second");
        String[] array = list.toArray(String[]::new);
        for (String string : array) {
            System.out.println(string);
        }

    }
}
