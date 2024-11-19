package test;

public class VowelCheck {
    public static void checkForVowels(String input) throws Exception {
        if (!input.toLowerCase().matches(".*[aeiou].*")) {
            throw new Exception("No vowels found in the string: " + input);
        }
        System.out.println("The string contains vowels: " + input);
    }

    public static void main(String[] args) {
        try {
            checkForVowels("abcdiof"); // Replace with any string to test
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
