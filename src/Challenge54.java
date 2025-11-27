import java.util.Scanner;
public class Challenge54 {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        String check = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: "+ check );

    }
}