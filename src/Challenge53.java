import java.util.Scanner;
public class Challenge53 {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int minimum = num1>num2 ? num2 : num1;
        System.out.println("Minimum number is: "+ minimum );

    }

}
