package exercises;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please typ your name:  ");
        String myString = input.next();
        System.out.println("Hello " + myString);
    }
}
