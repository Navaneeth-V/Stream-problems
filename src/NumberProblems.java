import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class NumberProblems {

    public void average(List<Integer> numbers) {

        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("The average of given list is: " + average.getAsDouble());
        } else {
            System.out.println("The list is empty.");
        }
    }

    public void max(List<Integer> numbers) {
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println("Maximum value of given List : " + max);
    }

    public void min(List<Integer> numbers) {
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println("Minimum value of given List : " + min);
    }

    public void secondSmallest(List<Integer> numbers) {
        int value = numbers.stream()
                .sorted()
                .limit(2)
                .skip(1)
                .collect(Collectors.toList()).get(0);

        System.out.println("Second Smallest value of given List : " + value);
    }

    public void secondLargest(List<Integer> numbers) {
        int value = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .collect(Collectors.toList()).get(0);

        System.out.println("Second Largest value of given List : " + value);
    }

    public void squareOfEven(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

}
