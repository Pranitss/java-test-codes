package test;

import java.io.*;

public class FileReaderExample {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        System.out.println("File exists: " + fileName);
    }

    public static void main(String[] args) {
        try {
            readFile("example.txt"); // Replace with your file name
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
