import java.util.Scanner;
public class Challenge58_valid_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division\n");

        System.out.print("Enter your choice: ");
        int operation = input.nextInt();

        if (operation < 1 || operation > 4) {
            System.out.println("Invalid operation selected! Try again.");
            return; // stop execution here
        }

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int result = switch (operation) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    yield 0; // break with a value
                }
                yield num1 / num2;
            }
            default -> 0;
        };

        System.out.println("Result: " + result);
    }
}
