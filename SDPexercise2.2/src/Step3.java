import java.util.Arrays;
import java.util.List;

public class Step3 {
    public static void main(String[] args) {
        List<Person> values = Arrays.asList(new Person("Tom"), new Person("Piet"), new Person("Henk"));

        // TODO: Print each person using "forEach" the doPrint method located in the Person class.
        values.forEach(person -> person.doPrint(person.getName()));
    }
}