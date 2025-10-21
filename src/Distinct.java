import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

    public void removeDuplicates(List<Integer> list) {
        List<Integer> distinct = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct values: " + distinct);
    }
}
