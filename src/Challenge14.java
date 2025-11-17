import java.util.Scanner;

public class Challenge14 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius Calculator.......");
        System.out.print("Please enter the temperature in fehrenheit: ");
        double f = input.nextDouble();
        double celsius = (f-32)*(5/9f);
        System.out.println("Celsius value of the temperature "+f+" is : "+ celsius);
    }
}
