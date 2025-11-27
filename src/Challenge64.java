import java.util.Scanner;
public class Challenge64 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = input.nextInt();

        System.out.print("Enter the number which occurrence you check: ");
        int number = input.nextInt();

        int[] arr = new int[size];
        ArrayUtility.IntArrayInput(arr);
        //ArrayUtility.IntArrayDisplay(arr);

        int occurrence = 0;
        for (int x : arr){
            if (x == number){
                occurrence++;
            }
        }

        System.out.println("Occurrence of the number is: "+occurrence);
    }
}