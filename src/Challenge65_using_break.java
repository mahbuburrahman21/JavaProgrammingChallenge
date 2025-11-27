import java.util.Scanner;
public class Challenge65_using_break {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int size = input.nextInt();
        System.out.print("Enter anything: ");
        String randomKeyword = input.next();
        do {
            if (randomKeyword.equals("exit")){
                System.out.println("Exit from the loop.");
                break;
            }
            System.out.print("Enter anything: ");
            randomKeyword = input.next();
        }while (true);
    }
}