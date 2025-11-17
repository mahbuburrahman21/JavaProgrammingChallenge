import java.util.Scanner;

public class Challenge29 {
    public static void main(String[] args) {
        int result =  sumOfOddNumber();
        System.out.print("Result is: "+result);
    }

    public static int sumOfOddNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number till where you want to know the sum of all odd number: ");
        int N = input.nextInt();
        int sum=0;
        int i=0;
        while(i<=N){
            if (i%2 != 0){
               sum += i;
            }
            i++;

        }
        return sum;
    }
}
