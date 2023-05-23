import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Exercise8 {

    /** helper function to compare doubles **/
    public static boolean areEqual(double a, double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }

    public static void main(String[] args) {
        double avg = calculateAverageWordLength("Hello world, this is a test string.");
        if (!areEqual(avg,4.143d, 0.001)) {
            throw new RuntimeException("Function not correctly implemented");
        }
        System.out.println("Function correctly implemented");
    }

    public static double calculateAverageWordLength(String input) {
        return Arrays.stream(input.split(" "))
                .mapToInt(String::length)
                .average()
                .orElse(0);
    }
}