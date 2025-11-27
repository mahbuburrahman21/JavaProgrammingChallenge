import java.util.Scanner;
public class Challenge60 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 12;
        System.out.print("Enter the number: ");
        int numCheck = input.nextInt();

        do {
            if (number == numCheck){
                System.out.println("Excellent guess!... Number matched!");
                return;
            }
            System.out.print("Wrong guess! Please Re-enter the number: ");
            numCheck = input.nextInt();
        } while (true);
    }
}
