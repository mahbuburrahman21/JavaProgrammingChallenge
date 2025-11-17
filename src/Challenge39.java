import java.util.Scanner;
public class Challenge39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of ROW: ");
        int row = input.nextInt();
        System.out.println("Here are your Right Half Pyramid");
        rightHalfPyramid(row);
        System.out.println("Here are your reverse Right Half Pyramid");
        reverseRightHalfPyramid(row);
        System.out.println("Here are your Left Half Pyramid");
        leftHalfPyramid(row);
    }

    public static void rightHalfPyramid(int rows){
        int i = 0;
        while(i<rows){
            int j=0;
            while (j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void reverseRightHalfPyramid(int rows){
        int i =rows;
        while (i>0){
            int j=i;
            while (j>0){
                System.out.print("* ");
                j--;
            }
            i--;
            System.out.println();
        }
    }

    public static void leftHalfPyramid(int rows){
        int i=0;
        while (i<rows){
            int j=rows-1;
            while (j>i){
                System.out.print("  ");
                j--;
            }
            int k =0;
            while (k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}