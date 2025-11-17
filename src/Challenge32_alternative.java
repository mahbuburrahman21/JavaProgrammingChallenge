import java.util.Scanner;

public class Challenge32_alternative {
    static void main(String[] args) {
        System.out.println("Find Least Common Multiple(LCM) of two numbers.......");
        int num1 = INPUT();
        int num2 = INPUT();
        int LCM = leastCommonMultiple(num1, num2);
        System.out.println("The least Common Multiple is: "+LCM);
    }

    public static int  INPUT(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        return input.nextInt();
    }

    public static int leastCommonMultiple(int num1, int num2){
        if (num2 % num1 == 0 || num1 % num2 == 0){
            if (num1>num2){
                return num1;
            }
            else
                return num2;
        }

        int i = 1;
        boolean flag = true;
        while(flag){
            if ((num1* i) % num2 == 0) {
                num1 = num1*i;
                flag = false;
            }
            else
                i++;
        }
        return num1;
    }
}

/*
public static int main leastCommonMultiple(int num1, int num2){
int i = 1;
  while(true){
    int factor = num1*i;
    if(factor % num2 == 0){
      return factor;
    }
   i++;
  }
}
*/