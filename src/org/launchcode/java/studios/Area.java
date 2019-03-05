package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("The area = " +area);
    }
}
