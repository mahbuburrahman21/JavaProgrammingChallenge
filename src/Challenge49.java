import java.util.Scanner;
public class Challenge49 {
    static void main(String[] args) {
        System.out.println("A program to do sum and average of all elements in a 2-D array......");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the array column: ");
        int column = input.nextInt();

        int[][] myArr = new int[rows][column];
        arrayInput(myArr, rows, column);
        int sum = sumOf2DArray(myArr, rows,column);
        System.out.println("Summation of the array is: "+sum);
        System.out.println("Average of the array element is: "+((float)sum/(rows*column)));



    }

    public static void arrayInput(int[][] myArr, int rows, int column){
        Scanner input = new Scanner(System.in);
        int i=0;
        while (i<rows){
            int j=0;
            while (j<column){
                System.out.print("Enter array element row wise: ");
                int element = input.nextInt();
                myArr[i][j] = element;
                j++;
            }
            i++;
        }
    }

    public static int sumOf2DArray(int[][] myArr,int rows , int column){
        int i = 0;
        int sum = 0;
        while (i<rows){
            int j = 0;
            while (j<column){
                sum += myArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
