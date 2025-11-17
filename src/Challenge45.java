import java.util.Arrays;
import java.util.Scanner;
public class Challenge45 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int arraySize = input.nextInt();
        int[] myArr = new int[arraySize];
        arrayInput(myArr);
        arrayReverse(myArr);

    }

    public static void arrayInput(int[] myArr){
        Scanner input =  new Scanner(System.in);
        int i = 0;
        while (i< myArr.length){
            System.out.print("Enter array Element: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }

    public static void arrayReverse(int[] myArr){
        int[] newArray = new int[myArr.length];
        int i = 0, j= myArr.length-1;
        while (i<myArr.length){
            newArray[i] = myArr[j];
            i++;
            j--;
        }

        System.out.println("Here are the reverse of the array: ");
        int k = 0;
        while (k< myArr.length){
            System.out.print(newArray[k]+" ");
            k++;
        }
    }
}
