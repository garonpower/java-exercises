package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int radius;

        do {
            System.out.println("Enter the radius: ");
            radius = keyboard.nextInt();
            if(radius <= 0) {
                System.out.println("Error: Enter a number greater than zero!");
            }
        }while (radius <= 0);

        double area = Math.PI * (radius * radius);
        System.out.println("The area = " +area);

    }
}
