import java.util.Arrays;

public class Exercise7 {



    public static void main(String[] args) {
        String[] expectation = {"this","test"};
        if (!Arrays.deepEquals(getWordsStartingWith('t', "this is a test"),expectation)) {
            throw new RuntimeException("Function not correctly implemented");
        }
    }


    public static String[] getWordsStartingWith(char letter, String input) {
        return (String[]) Arrays.stream(input.split(" "))
                .filter(word -> word.charAt(0) == letter)
                .toArray();
    }
}