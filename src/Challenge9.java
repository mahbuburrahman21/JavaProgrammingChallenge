import java.util.Scanner;
class Challenge9{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first floating point number: ");
        float num1 = input.nextFloat();
        System.out.print("Please enter the Second floating point number: ");
        float num2 = input.nextFloat();

        float product = num1*num2;
        System.out.println("Product of two floating point number: "+ product);
    }
}
