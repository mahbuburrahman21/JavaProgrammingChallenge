import java.util.Scanner;
public class Challenge27 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd even check using bitwise operator..........");
        System.out.print("Input a number to check odd or even: ");
        int num = input.nextInt();

        if ((num & 1) == 1)
        {
            System.out.println("Odd number");
        }
        else
            System.out.println("Even number");
    }
}
