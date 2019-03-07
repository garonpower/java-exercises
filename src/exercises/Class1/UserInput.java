package exercises.Class1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your name: ");
        String name = input.next();
        System.out.println("Hello " +name);
    }
}
