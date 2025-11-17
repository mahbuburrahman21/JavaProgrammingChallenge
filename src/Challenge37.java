import java.util.Scanner;
public class Challenge37 {
     public static void main(String[] args) {
        System.out.println("......Armstrong number check portal......");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong Number: ");
        int num = input.nextInt();
        int sumOfTheNumber = armstrong(num);

        if (sumOfTheNumber == num){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }

    public static int armstrong(int num){
        int digits = digitCal(num);
        int original = num;
        int sum = 0;

        while(original > 0){
            int result = 1;
            int rem = original % 10;
            for(int j = 0; j < digits; j++){
                result *= rem;
            }
            sum += result;
            original /= 10;
        }

        return sum;
    }


    public static int digitCal(int num){
        int i = 0;
        int temp = num;
        while(temp > 0){
            temp /= 10;
            i++;
        }
        return i;
    }

}