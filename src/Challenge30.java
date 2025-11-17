import java.util.Scanner;

public class Challenge30 {
    public static void main(String[] args) {
        int result = factorialOFaNumber();
        System.out.println("The factorial is: " + result);
    }

    public static int factorialOFaNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to calculate the factorial: ");
        int num = input.nextInt();
        int mult = 1;
        int i = 1;

        while (i <= num) {
            mult *= i;
            i++;
        }
        return mult;
    }
}
