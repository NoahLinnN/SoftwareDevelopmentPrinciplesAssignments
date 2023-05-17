import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. Anonymous Class implementation
        Log log1 = new Log() {
            public void log(int logLevel, String message) {
                System.out.println(logLevel + ": " + message);
            }
        };

        log1.log(0,"This is some message!");
        log1.log(3,"This is a message with a higher log level!");
        log1.log(99,"This is very important message!");

        System.out.println();

        //2. Lambda Expression implementation
        Log log2 = (logLevel, message) -> System.out.println(logLevel + ": " + message);

        log2.log(0,"This is some message!");
        log2.log(3,"This is a message with a higher log level!");
        log2.log(99,"This is very important message!");

        //List example
        List<String> names = Arrays.asList("Anthony","Rogier","Jan Jaap","Michel");

        //1. Iteration + print (Normal)
        for (String s: names) {
            System.out.println(s);
        }

        //2. Iteration + print (Lambda)
        names.forEach(name -> System.out.println(name));

        //3. Iteration + print (Lambda simpler)
        names.forEach(System.out::println);
    }
}