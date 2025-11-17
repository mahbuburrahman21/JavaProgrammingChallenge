import java.util.Scanner;

public class Challenge31_alternative {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to sum the digit: ");
        int num = input.nextInt();
        int result = sumOfDigits(num);
        System.out.println("The sum of all digits is: "+result);
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
