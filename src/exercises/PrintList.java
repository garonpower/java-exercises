package exercises;

// import java.util.Arrays;
import java.util.Scanner;

public class PrintList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter;

        System.out.println("Enter a sentance and the computer will count the " +
                "number of five-letter words used:  ");
        String para = input.nextLine();

        counter = 0;
        char[] c = para.toCharArray();
        for (int i = 0; i < c.length; i++) {

            String s = "";

            while (i < c.length && c[i] != ' ') {
                s = s + c[i];
                i++;
            }

            if (s.length() == 5)
                counter = counter + 1;
        }

        System.out.println("There are " +counter+ " five-letter words");
    }
}
