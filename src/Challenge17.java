import java.util.Scanner;
public class Challenge17 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To see which number is greater............");
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3)
        {
            System.out.println( num1+" is greater");
        } else if (num2>num1 && num2>num3)
        {
            System.out.println(num2+ " is greater");
        }
        else
            System.out.println(num3 +" is greater");

    }
}
