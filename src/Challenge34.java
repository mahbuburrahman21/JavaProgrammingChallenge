import java.util.Scanner;
public class Challenge34 {
    static void main(String[] args) {
        if (checkPrime()==0){
            System.out.println("Prime number");
        }
        else
            System.out.println("Not a prime number");
    }

    public static int checkPrime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
        int num = input.nextInt();
        int i = 2;
        while (i<num){
            if (num%i == 0){
                return 1;
            }
            i++;
        }
        return 0;
    }
}
