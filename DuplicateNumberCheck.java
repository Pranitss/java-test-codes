package test;
import java.util.*;

public class DuplicateNumberCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter integers separated by spaces:");
            String[] input = scanner.nextLine().split(" ");
            Set<Integer> numbers = new HashSet<>();
            
            for (String num : input) {
                int number = Integer.parseInt(num);
                if (!numbers.add(number)) {
                    throw new Exception("Duplicate number found: " + number);
                }
            }
            System.out.println("No duplicates found.");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
