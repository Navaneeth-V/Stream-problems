import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseConverter {

    public void upperCase(List<String> characters) {
        List<String> uppercase = characters.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercase);
    }

    public void lowerCase(List<String> characters) {
        List<String> lowerCase = characters.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(lowerCase);
    }
}
