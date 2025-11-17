import java.util.Scanner;
public class Challenge44{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt();
        int[] myArr = new int[arraySize];
        arrayInput(myArr);

        System.out.print("Enter the position (1 to arraySize) you want to delete: ");
        int position = input.nextInt();
        int index = position-1;
        deleteElementFromSpecificPosition(myArr, index);
    }

    public static void arrayInput(int[] myArr){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i<myArr.length){
            System.out.print("Enter the array element: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }

    public static void deleteElementFromSpecificPosition(int[]myArr, int index){

        int i = index;
        while (i< myArr.length-1){
            myArr[i] = myArr[i+1];
            i++;
        }

        int j = 0;
        while (j<myArr.length-1){
            System.out.print(myArr[j]+" ");
            j++;
        }
    }
}