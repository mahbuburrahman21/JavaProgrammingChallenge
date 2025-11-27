import java.util.Scanner;
public class Challenge63 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        ArrayUtility.IntArrayInput(arr);
        //ArrayUtility.IntArrayDisplay(arr);

        int max = arr[0];
        for (int x : arr){
            if (x > max){
                max = x;
            }
        }

        System.out.println("Maximum number is: "+max);
    }
}