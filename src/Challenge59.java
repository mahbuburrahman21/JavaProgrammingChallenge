import java.util.Scanner;
public class Challenge59 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "mahbub";
        System.out.print("Enter your password: ");
        String passCheck = input.next();

        do {
            if (password.equals(passCheck)){
                System.out.println("Password matched!");
                return;
            }
            System.out.print("Wrong password! Please Re-enter the password: ");
            passCheck = input.next();
        } while (true);
    }
}
