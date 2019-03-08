package exercises;

import java.util.Arrays;
import  java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        //store string
        String para = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";

        //prompt user for search term
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search variable: ");
        String search = input.next();

        //iterate through string with search term & print whether search term was found
        Boolean found = Arrays.asList(para.split(" ")).contains(search);
        if(found){
            System.out.println("Your search term was found");
        } else {
            System.out.println(search+ " was not found");
        }
        //bonus: make case-insensitive


    }
}
