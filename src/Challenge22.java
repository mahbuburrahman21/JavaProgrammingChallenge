import java.util.Scanner;
public class Challenge22 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("OR operation using bitwise operator..........");
        System.out.print("Input 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Input 2nd number: ");
        int num2 = input.nextInt();

        int result = num1 | num2;
        System.out.println("Result is: "+ result);
    }
}
