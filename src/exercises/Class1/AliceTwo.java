package exercises.Class1;

import java.util.Scanner;

public class AliceTwo {
    public static void main(String[] args) {
        String para = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search variable: ");
        String search = input.next();

        if (para.contains(search)) {
            System.out.println(search+ " was found");
        } else {
            System.out.println(search+ " was not found");
        }
    }
}
