import java.util.Scanner;
public class Challenge10 {
    static void main(String[] args) {
        System.out.println("\nPerimeter of a rectangle......\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height of the rectangle : ");
        double height = input.nextDouble();
        System.out.print("Please enter the base of the rectangle : ");
        double base = input.nextDouble();

        double perimeter = (2*(height+base));
        System.out.println("Perimeter of the rectangle is : "+perimeter);
    }
}
