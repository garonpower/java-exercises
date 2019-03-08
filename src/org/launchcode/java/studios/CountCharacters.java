package org.launchcode.java.studios;

import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {

        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget " +
                "massa. Donec nec velit non ligula efficitur luctus.";

        String s = string.toUpperCase();

        char[] c = s.toCharArray();
        Arrays.sort(c);
        int l = c.length;
        int i = 0, j = 0, counter = 0;

        for (i = 0; i < l; i++) {
            counter = 0;
            for (j = 0; j < l; j++) {

                if (j < i && c[i] == c[j]) {
                    break;
                }

                if (c[j] == c[i]) {
                    counter++;
                }

                if (j == l-1) {
                    System.out.println(c[i] + " occurs " +counter+ " times!");
                }
            }


        }
    }
}
