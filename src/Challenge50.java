import java.util.Scanner;
public class Challenge50 {
    static void main(String[] args) {
        System.out.println("A program to find the sum of two diagonal elements......");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the array column: ");
        int column = input.nextInt();

        int[][] myArr = new int[rows][column];
        arrayInput(myArr, rows, column);

        int sum = sumOf2DiagonalElement(myArr, rows,column);
        System.out.println("Summation of two diagonal element the array is: "+sum);

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

    public static int sumOf2DiagonalElement(int[][] myArr,int rows , int column){
        int i = 0;
        int sum = 0;
        while (i<2){
            int j = 0;
            while (j<column){
                if (i==j){
                    sum += myArr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
