package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 3) {
            try {
                int myInt = scanner.nextInt();
                System.out.println("Integer: " + myInt);
                counter += 1;
            } catch (InputMismatchException e) {
                System.out.println("Oops, not an integer :(");
                scanner.next();
            }
        }
        scanner.close();
    }

}
