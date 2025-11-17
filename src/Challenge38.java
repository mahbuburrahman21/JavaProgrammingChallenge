import java.util.Scanner;
public class Challenge38 {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome){
            System.out.println("The number is Palindrome.");
        }
        else {
            System.out.println("Not a palindrome.");
        }

    }
    public static boolean isPalindrome(int num){
        int rev = reverseNumber(num);
        return num == rev;
    }
    public static int reverseNumber(int num){
        int rev=0;
        while(num>0){
            int reminder = num%10;
            rev = rev*10+reminder;
            num /= 10;
        }
        return rev;
    }
}