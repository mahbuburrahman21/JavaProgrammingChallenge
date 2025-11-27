import java.util.Scanner;
public class Challenge66_using_Continue {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i<5; i++){
            System.out.print("Enter number to add: ");
            int number = input.nextInt();
            if (number<0){
                continue;
            }
            sum += number;
        }
        System.out.println("The summation of all integers: "+ sum);

//        int i = 0;
//        while (i<10){
//            System.out.print("Enter number to add: ");
//            int number = input.nextInt();
//            if (number<0){
//                i++;
//                continue;
//            }
//            sum += number;
//            i++;
//        }

    }
}




