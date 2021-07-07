package java11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Features {
    public static void main(String[] args) {
        predicate();
        localVariable();
    }

    public static void predicate() {
        List<String> list = Arrays.asList(" ", " \n", "str1\n str2\n str3");
        list.stream().forEach(System.out::print);

        List listWithout = list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        listWithout.stream().forEach(System.out::print);
    }

    public static void localVariable() {
        List<String> strList = Arrays.asList("java", "python");
        List<String> strUppderCase = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        strUppderCase.stream().forEach(System.out::print);
    }
}
