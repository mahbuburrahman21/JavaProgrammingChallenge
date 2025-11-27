import java.util.Scanner;
public class Challenge58_buggy {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. press 1 to calculate addition of tow number. ");
        System.out.println("2. press 2 to calculate Substraction of tow number. ");
        System.out.println("3. press 3 to calculate multiplication of tow number. ");
        System.out.println("4. press 4 to calculate division of tow number. \n");
        System.out.print("Enter the number Which operation you want: ");
        int operation = input.nextInt();

        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int result = switch (operation){
            case 1 -> (num1+num2);
            case 2 -> (num1-num2);
            case 3 -> (num1*num2);
            case 4 -> (num1/num2);
            default -> -1;
        };
        System.out.println("Result of the operation is: "+ result);
    }
}
//buggy code