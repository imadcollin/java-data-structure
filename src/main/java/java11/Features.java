package java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Features {

    public List<String> stringsWithoutBlanks(String str) {
       return  str.lines().filter(line -> !line.isBlank()).map(String::strip)
                .collect(Collectors.toList());
    }
    public List<String> predicate(List<String> list) {

      return list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
    }

    public void localVariable() {
        List<String> strList = Arrays.asList("java", "python");
        List<String> strUppderCase = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        strUppderCase.stream().forEach(System.out::print);
    }

        public void CollectiontoArray(){
                List<String> list = Arrays.asList("first", "second");
                String[] array = list.toArray(String[]::new);
                for (String string : array) {
                    System.out.println(string);
                }
        }
    }
