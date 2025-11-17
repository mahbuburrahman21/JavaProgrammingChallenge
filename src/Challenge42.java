import java.util.Scanner;

public class Challenge42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int arraySize = input.nextInt();
        int[] myArr = new int[arraySize];
        arrayInput(myArr, arraySize);
        int max = maxFind(myArr, arraySize);
        System.out.println("Maximum number in this array is: "+max);
        int min = minFind(myArr, arraySize);
        System.out.println("Minimum number in this array is: "+min);
    }

    public static void arrayInput(int[] myArr, int arraySize){
        Scanner input = new Scanner(System.in);
        int i=0;
        while (i<arraySize){
            System.out.print("Enter the Array element: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }

    public static int maxFind(int[] myArr, int arraySize){
        int i=0;
        int j=i+1;
        int max = myArr[i];
        while (j<arraySize){
            if (myArr[i]>myArr[j]){
                j++;
            }
            else {
                max = myArr[j];
                i=j;
                j=j+1;
            }
        }
        return max;
    }

    public static int minFind(int[] myArr, int arraySize){
        int i=0;
        int j=i+1;
        int min = myArr[i];
        while (j<arraySize){
            if (myArr[i]<myArr[j]){
                j++;
            }
            else {
                min = myArr[j];
                i=j;
                j=j+1;
            }
        }
        return min;
    }
}