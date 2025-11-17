import java.util.Scanner;
public class Challenge40 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the array size: ");
      int size = input.nextInt();

      int[] myArr = new int[size];

      System.out.println("Array element input......");
      int i = 0;
      while (i<size){
          System.out.print("Enter array element: ");
          int a = input.nextInt();
          myArr[i] = a;
          i++;
      }
      int sum = 0;
      int j = 0;
      while (j<size){
          sum += myArr[j];
          j++;
      }
      System.out.println("Summation of the array: "+ sum);
      float avg = ((float)sum/size);
      System.out.println("Average of the array: "+avg);
    }
}