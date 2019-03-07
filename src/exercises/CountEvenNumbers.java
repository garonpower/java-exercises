package exercises;

import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int start, end;

        System.out.println("Enter starting number:  ");
        start = keyboard.nextInt();
        System.out.println("Enter ending number: ");
        end = keyboard.nextInt();

        int total = 0;

        for(int i = start; i <= end ; i++) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }

        System.out.println("The sum of even numbers between " + start + "and " + end + " = " + total);
    }
}
