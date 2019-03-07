package exercises.Class2;

import java.util.Scanner;

public class MilePerGallon {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        double miles = scanner.nextDouble();
        System.out.println("Enter gallons of gas used: ");
        double gas = scanner.nextDouble();

        double mpg = miles/gas;
        System.out.println("MPG = " +mpg);
    }
}
