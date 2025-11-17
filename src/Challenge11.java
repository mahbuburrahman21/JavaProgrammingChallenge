 import java.util.Scanner;
    class Challenge11{
        public static void main(String[]args) {
            System.out.println("\nArea of  a Triangle......\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the height of the triangle : ");
            double height = input.nextDouble();
            System.out.print("Please enter the base of the triangle : ");
            double base = input.nextDouble();

            double area=  ((1/2f)*base*height);
            System.out.println("Area of the triangle is : "+area);
        }
    }