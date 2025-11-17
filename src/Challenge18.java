import java.util.Scanner;
public class Challenge18 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Leap year Calculator.......");

        System.out.print("Enter the year you want to calculate: ");
        int year = input.nextInt();

        if (year%400==0)
        {
            System.out.println("leap year!");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("Leap year!");
        }
        else
            System.out.println("Not a Leap year!");

        //This can be also written in this way...................
        //if(year%400==0 || (year%4==0 && year%100!=0)) {Leap year}
        //else {Not a leap year}
    }
}