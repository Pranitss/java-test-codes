package test;

import java.io.*;
import java.util.Scanner;

public class PositiveNumberCheck {
    public static void readNumbers(String fileName) throws Exception {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    throw new Exception("Positive number found: " + number);
                }
            }
            System.out.println("No positive numbers found.");
        }
    }

    public static void main(String[] args) {
        try {
            readNumbers("numbers.txt"); // Replace with your file name
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
