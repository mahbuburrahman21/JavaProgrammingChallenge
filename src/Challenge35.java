import java.util.Scanner;

public class Challenge35 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse the digits of the number: ");
        int num = input.nextInt();
        int rev = reverseDigits(num);
        System.out.println("Reverse of the number is: "+rev);
    }

    public static int reverseDigits(int num){
        int newNum = 0;
        while(num>0){
          int rem=  num%10;
          newNum = newNum *10 + rem;
          num= num/10;
        }
        return newNum;
    }
}

