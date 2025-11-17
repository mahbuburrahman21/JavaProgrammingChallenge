import java.util.Scanner;
public class Challenge28_alternative {
    public static void main(String[] args) {
        multiple(4); // enter the number you want to see the multiplication table
    }

    public static void multiple(int num){
        int i=1;
        while(i<13){
            System.out.println(num +" * "+i +" = "+(num*i));
            i++;
        }
    }
}
