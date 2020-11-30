package csv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var users = new UserCsvReader().readUserCsv("users.csv");
        // TODO Q2.1
        List<String> nameList = users.stream()
                .filter(o -> o.getCode().substring(0,1).equals("m"))
                .map(s -> s.getName().toLowerCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nameList);

    }
}
