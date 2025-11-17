import java.util.Scanner;
public class Challenge24 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NOT operation using bitwise operator..........");
        System.out.print("Input a number: ");
        int num1 = input.nextInt();


        int result = ~num1;
        System.out.println("Result is: "+ result);
    }
}
