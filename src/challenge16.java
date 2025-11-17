import java.util.Scanner;
public class challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check odd or even:  ");
        int number = input.nextInt();

        if (number % 2 ==0)
        {
            System.out.println("Even number");
        }
        else
            System.out.println("Odd Number");
    }
}
