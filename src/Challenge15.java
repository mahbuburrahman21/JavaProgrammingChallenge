import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number to check positive or Negative: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("The number enter is 0");
        } else if (number < 0) {
            System.out.println("The number is Negative");
        }
        else
            System.out.println("the number is positive");
    }
}
