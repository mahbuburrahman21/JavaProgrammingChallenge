import java.util.Scanner;
public class Challenge26 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Right shift operation using bitwise operator..........");
        System.out.print("Input a number: ");
        int num1 = input.nextInt();


        int result = num1>>1; // it can be any number 1/2/3 or others depends on how many bits should be shifted.
        System.out.println("Result is: "+ result);
    }
}
