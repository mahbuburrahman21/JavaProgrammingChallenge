import java.util.Scanner;

public class Challenge41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int arraySize = input.nextInt();
        int[] myArr = new int[arraySize];
        arrayInput(myArr,arraySize);
        System.out.print("Enter the number you want to find: ");
        int num = input.nextInt();
        int count =  occurrenceOfNum(myArr, arraySize, num); // How may time the num occurred is stored in the count.
        System.out.println("The number "+num+" occurred : "+count);
    }

    public static void arrayInput(int[] myArr,int arraySize){
        Scanner input =  new Scanner(System.in);
        int i = 0;
        while (i<arraySize){
            System.out.print("Enter the array element: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }

    public static int occurrenceOfNum(int[] myArr, int arraySize, int num){
        int occur = 0;
        int i = 0;
        while (i<arraySize){
            if (myArr[i] == num){
                occur++;
            }
            i++;
        }
        return occur;
    }
}
