import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> characters = Arrays.asList("RED", "grEEn", "greY", "white", "Orange", "pink");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 30, 40, 50);
        Map<String, String> values = new HashMap<>();

        NumberProblems number = new NumberProblems();
        CaseConverter converter = new CaseConverter();
        Sum sum = new Sum();
        Distinct distinct = new Distinct();
        StringProblems problems = new StringProblems();

        values.put("john.doe", "John Doe");
        values.put("jane.smith", "Jane Smith");
        values.put("guest", "Guest User");
        values.put("testuser", "Test User");

//        number.average(numbers);
//        number.max(numbers);
//        number.min(numbers);
//        number.secondLargest(numbers);
//        number.secondSmallest(numbers);
//        converter.upperCase(characters);
//        converter.lowerCase(characters);
//        sum.sumOfOddNumbers();
//        sum.sumOfEvenNumbers();
//        distinct.removeDuplicates(numbers);
//        problems.countStringWithStarting(characters, "G");
//        problems.ascendingOrder(characters);
//        problems.descendingOrder(characters);
//        problems.countCharacters("I am a Nobody");

        List<Employee> employees = new ArrayList<>();

        employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .collect(Collectors.toList());


        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .collect(Collectors.toList());

        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());

        employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Function.identity()
                ));

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment
                ));

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
                ));

        employees.stream()
                .map(Employee::getSalary)
                .sorted()
                .limit(2)
                .skip(1)
                .collect(Collectors.toList()).get(0);


        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.minBy(Comparator.comparingInt(Employee::getAge))
                ));


    }
}