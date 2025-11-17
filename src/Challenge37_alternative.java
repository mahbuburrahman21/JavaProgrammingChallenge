import java.util.Scanner;
public class Challenge37_alternative {
    public static void main(String[] args){
        System.out.println("Welcome to Armstrong Number Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }

    public static boolean isArmstrong(int num){
        int numCopy = num;
        int sumOfDigits = 0;
        int digits = digitCalculator(num);
        while (num>0){
            int reminder = num%10;
            sumOfDigits = sumOfDigits+power(reminder,digits);
            num /= 10;
        }
        return sumOfDigits == numCopy;
    }

    public static int power(int x, int n){ //x is the number to power. And n is the power. x to the power n.
        int i = 0;
        int result = 1;
        while (i<n){
            result *= x;
            i++;
        }
        return result;
    }

    public static int digitCalculator(int num){
        int digit = 0;
        while (num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}