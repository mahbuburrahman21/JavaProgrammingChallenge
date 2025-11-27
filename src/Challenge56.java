import java.util.Scanner;
public class Challenge56 {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        String result = (number > 80) ? "High" : (number>=50) ? "Moderate" : "Low";

        System.out.println("The student result is: "+ result);
    }
}