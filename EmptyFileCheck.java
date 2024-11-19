package test;
import java.io.*;

public class EmptyFileCheck {
    public static void checkFile(String fileName) throws Exception {
        File file = new File(fileName);
        if (file.length() == 0) {
            throw new Exception("File is empty: " + fileName);
        }
        System.out.println("File is not empty: " + fileName);
    }

    public static void main(String[] args) {
        try {
            checkFile("example.txt"); // Replace with your file name
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
