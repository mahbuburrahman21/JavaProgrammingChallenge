import java.util.Scanner;
public class Challenge69_palindrome_recursion {
    static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String word = input.next();
        System.out.println("Your string is "+ ((isPalindrome(word) ? "Palindrome" :
                                                                     "Not Palindrome")));


    }
    public static boolean isPalindrome(String word){
        if (word.length() <= 1){
            return true;
        }
        int lastPos = word.length() - 1;
        if (word.charAt(0) != word.charAt(lastPos)){
            return false;
        }
        String newStr = word.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}