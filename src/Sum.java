import java.util.List;
import java.util.stream.IntStream;

public class Sum {

    // sum of first 10 odd numbers
    public void sumOfOddNumbers() {
        int sum = IntStream.iterate(1, n -> n + 2)
                .limit(10)
                .sum();

        System.out.println("Sum of Odd numbers: " + sum);
    }

    // sum of first 10 even numbers
    public void sumOfEvenNumbers() {
         int sum = IntStream.iterate(0, n -> n+2)
                        .limit(10)
                        .sum();

         System.out.println("Sum of Even numbers: " + sum);
    }
}
