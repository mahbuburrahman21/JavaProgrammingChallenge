import java.util.Scanner;
public class ArrayUtility {
    public static void IntArrayInput(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i=0; i< array.length; i++){
            System.out.print("Enter number in position "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
    }

    public static void IntArrayDisplay(int[] array){
        for (int x : array){
            System.out.print(x+" ");
        }
    }
}
