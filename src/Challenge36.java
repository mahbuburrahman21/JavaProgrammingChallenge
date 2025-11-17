import java.util.Scanner;

public class Challenge36 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series calculator.....");
        System.out.print("Enter the number to calculate the fibonacci: ");
        int num = input.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num){
        if (num<0) return;
        int a=0;
        int b=1;
        int newNum = 0;
        while (newNum<=num){
            System.out.print(newNum+" ");
            newNum=a+b;
            b=a;
            a=newNum;
            if (newNum<=num){
                System.out.print(", ");
            }
        }
    }
}