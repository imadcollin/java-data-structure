package java11;

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

    public  List<String> localVariable(List<String> strList) {
        return strList.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public String[] CollectionToArray(List<String> strList){
        return strList.toArray(String[]::new);
    }
}
