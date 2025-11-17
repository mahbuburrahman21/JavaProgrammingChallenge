import java.util.Scanner;
public class Challenge32 {
    public static void main(String[] args) {
        System.out.println("Find Least Common Multiple(LCM) of two numbers.......");
        int num1 = INPUT();
        int num2 = INPUT();
        int LCM = leastCommonMultiple(num1, num2);
        System.out.println("The least Common Multiple is: "+LCM);
    }

    public static int INPUT(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        return input.nextInt();
    }

    public static int leastCommonMultiple(int num1, int num2){
        int i = 1;
        boolean flag = true;
        while(flag){

            if (i%num1 ==0 && i%num2 ==0){
                flag = false;
            }
            else
                i++;

        }
        return i;
    }
}