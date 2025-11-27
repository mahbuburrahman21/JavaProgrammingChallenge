import java.util.Scanner;
public class Challenge55 {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int absolute = (number > 0) ? number : (number*(-1));

        System.out.println("Absolute value of the number "+number+" is: "+ absolute);
    }
}