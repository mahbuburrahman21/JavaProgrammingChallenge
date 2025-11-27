import java.util.Scanner;
public class Challenge61 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which number table you want: ");
        int num = input.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}