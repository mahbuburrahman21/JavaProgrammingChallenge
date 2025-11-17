import java.util.Scanner;
public class Challenge43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt();
        int[] myArr = new int[arraySize];
        arrayInput(myArr);
        boolean ascending = ascendingCheck(myArr);
        boolean descending = descendingCheck(myArr);
        if (ascending){
            System.out.println("Array is sorted in ascending order.");
        } else if (descending) {
            System.out.println("Array is sorted in descending order.");
        }
        else
            System.out.println("Array is not sorted.");
    }

    public static void arrayInput(int[] myArr){
        Scanner input = new Scanner(System.in);
        int i =0;
        while (i<myArr.length){
            System.out.print("Enter array elements: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }
    public static boolean ascendingCheck(int[] myArr){
        int i = 0;
        while (i<myArr.length-1){
            if (myArr[i]<=myArr[i+1]){
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static boolean descendingCheck(int[] myArr){
        int i = 0;
        while (i<myArr.length-1){
            if (myArr[i]>=myArr[i+1]){
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}