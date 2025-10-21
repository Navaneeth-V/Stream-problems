import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProblems {

    public void countStringWithStarting(List<String> strings, String letter) {

        long count = strings.stream()
                .filter(s -> s.startsWith(letter.trim().toLowerCase()))
                .count();

        System.out.println(count);
    }

    public void ascendingOrder(List<String> strings) {
        List<String> ordered = strings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        System.out.println(ordered);
    }

    public void descendingOrder(List<String> strings) {
        List<String> ordered = strings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());

        System.out.println(ordered);
    }

    /*
    count and print the number character repetition in a given String.
     */
    public void countCharacters(String word) {
        Map<Character, Long> map = word.chars()
                .mapToObj(s -> (char) s)
                .map(Character::toLowerCase)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
