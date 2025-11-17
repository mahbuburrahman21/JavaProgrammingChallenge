import java.util.Scanner;
public class Challenge47 {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to marge two sorted array...");

        System.out.print("Enter the first array Size: ");
        int arraySize1 = input.nextInt();
        int[] arr1 = new int[arraySize1];
        arrayInput(arr1);

        System.out.print("Enter the Second array Size: ");
        int arraySize2 = input.nextInt();
        int[] arr2 = new int[arraySize2];
        arrayInput(arr2);

        int[] mergedArray = new int[arraySize1+arraySize2];
        //Putting first array element in the merged array.
        int i =0;
        while (i<arraySize1){
            mergedArray[i] = arr1[i];
            i++;
        }
        //Putting second array element in the merged array.
        int j = arr1.length;
        int k = 0;
        while (j<mergedArray.length){
            mergedArray[j] = arr2[k];
            j++;
            k++;
        }

        System.out.println("Here are the merged array: ");
        int l=0;
        while (l< mergedArray.length){
            System.out.print(mergedArray[l]+" ");
            l++;
        }
    }

    public static void arrayInput(int[] myArr){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i<myArr.length){
            System.out.print("Enter array element: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }
}