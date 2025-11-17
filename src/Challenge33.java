import java.util.Scanner;

public class Challenge33 {
    static void main(String[] args) {
        System.out.println("Calculate GCD of two numbers........");
        int num1 = INPUT();
        int num2 = INPUT();
        int gcd = greatestCommonMultiple(num1, num2);
        System.out.println("The gcd of this two numbers are: "+gcd);

    }
    public static int INPUT(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        return  input.nextInt();
    }

    public static int greatestCommonMultiple(int num1, int num2){
        int i = 2;
        while (i<=num1){
            if (num1%i == 0 && num2%i == 0){
                return i;
            }
            i++;
        }
        return 1;
    }
}
