import java.util.Scanner;
public class Challenge46 {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int arraySize = input.nextInt();
        int[] myArr = new int[arraySize];
        arrayInput(myArr);
        boolean isPalindrome = arrayPalindromeCheck(myArr);
        if (isPalindrome){
            System.out.println("The array is Palindrome.");
        }
        else {
            System.out.println("This array is not a Palindrome.");
        }

    }

    public static void arrayInput(int[] myArr){
        Scanner input = new Scanner(System.in);
        int i =0;
        while (i<myArr.length){
            System.out.print("Enter array element: ");
            int element = input.nextInt();
            myArr[i] = element;
            i++;
        }
    }

    public static boolean arrayPalindromeCheck(int[] myArr){
        int i = 0, j = myArr.length-1;
        while (i<= (myArr.length/2)){
            if (myArr[i] == myArr[j]){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}