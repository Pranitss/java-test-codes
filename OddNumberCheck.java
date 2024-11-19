package test;

public class OddNumberCheck {
    public static void checkNumber(int number) throws Exception {
        if (number % 2 != 0) throw new Exception("Odd number: " + number);
        System.out.println("Even number: " + number);
    }

    public static void main(String[] args) {
        try {
            checkNumber(5); // Test with any number
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

