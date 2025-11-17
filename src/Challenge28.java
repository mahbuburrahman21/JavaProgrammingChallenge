import java.util.Scanner;
public class Challenge28 {
    public static void main(String[] args) {
        multiple();
    }

    public static void multiple(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see it's multiplication table: ");
        int num = input.nextInt();
        int i=1;
        while(i<13){
            System.out.println(num +" * "+i +" = "+(num*i));
            i++;
        }
    }
}
