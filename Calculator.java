
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("Welcome Mostafa Adel Elkholey to the Simple Calculator!");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display operation choices
        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        int choice = scanner.nextInt();

        // Perform the chosen operation
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        // Close the scanner
        scanner.close();
    }
}
