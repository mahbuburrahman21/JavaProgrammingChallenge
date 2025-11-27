import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Challenge57_alternative {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vaai koto number mash jante chao? Seta bolo: ");
        int mash = input.nextInt();

        String month = switch (mash){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Entry. Enter a number between 1 to 12";
        };
        System.out.println("The month is: "+month);
    }
}