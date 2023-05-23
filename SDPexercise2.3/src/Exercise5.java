import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {
        new Exercise5().exec();
    }

    public void exec() {
        List<String> list = Arrays.asList("this", "is", "a", "test");

        exercise(list);
    }

    private void exercise(List<String> list) {
        //TODO What is the average number of letters used in the words
        //     Hint: use .mapToInt or .collect
        System.out.println(
                list.stream()
                        .collect(Collectors.averagingInt(String::length))
        );
    }
}