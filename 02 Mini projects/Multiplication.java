package coding.forest.pilot.controller;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        int product;

        for (int i=1; i<10; i++) {
            String s1 = String.format("\nMultiples of %d", i);
            System.out.println(s1);
            for (int j=1; j<10; j++) {
                product = i*j;
                String mult = String.format("%d * %d = %d", i, j, product);
                System.out.println(mult);
            }
        }
    }
}
