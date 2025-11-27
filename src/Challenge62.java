import java.util.Scanner;
public class Challenge62 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check prime: ");
        int num = input.nextInt();

        for (int i = 2; i<num; i++){
            if (num%i==0){
                System.out.println("Not a prime number.");
                return;
            }
        }
        System.out.println("Prime number");
    }
}