import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {
        int[] wordLengths = countWordsStartingWith('h', "hello world this, I hope is a hello string");
        int[] expected = {5,4,5};
        if (!Arrays.equals(wordLengths,expected)) {
            throw new RuntimeException("Function not correctly implemented");
        }
        System.out.println("Function correctly implemented");
    }

    public static int[] countWordsStartingWith(char letter, String input) {
        return Arrays.stream(input.split(" "))
                .filter(word -> word.charAt(0) == letter)
                .mapToInt(word -> 1).toArray();
    }
}