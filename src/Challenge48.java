import java.util.Scanner;
public class Challenge48 {
    static void main(String[] args) {
        System.out.println("A program to search an element in a 2-D array........");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the array column: ");
        int column = input.nextInt();
        int[][] myArr = new int[rows][column];

        arrayInput(myArr, rows, column);

        System.out.print("Enter the number you want to find: ");
        int num = input.nextInt();

        boolean isFound = search(myArr, rows, column, num);
        if (isFound){
            System.out.println("Your number is found in the array.");
        }
        else {
            System.out.println("Your number is not found.");
        }
    }

    public static void arrayInput(int[][] myArr, int rows, int column){
        Scanner input = new Scanner(System.in);
        int i=0;
        while (i<rows){
            int j=0;
            while (j<column){
                System.out.print("Enter array element row ways: ");
                int element = input.nextInt();
                myArr[i][j] = element;
                j++;
            }
            i++;
        }
    }

    public static boolean search(int[][] myArr, int rows, int column, int num){
        int i = 0;
        while (i<rows){
            int j = 0;
            while (j<column){
                if (myArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}