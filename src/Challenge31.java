public class Challenge31 {
    static void main(String[] args) {
        System.out.println(".....Sum of the all digits of a number.....");
        int sumOFTheGivenDigit = sumOfDigit(52455616);
        System.out.println("The sum will be: "+ sumOFTheGivenDigit);
    }
    public static int sumOfDigit(int number){
        int sum = 0;
        boolean flag = true;
        int vagfol = number;
        while(flag){
            if (vagfol != 0){
                sum = sum + vagfol%10;
            }
            else
                flag = false;
            vagfol = vagfol/10;
        }
        return sum;
    }
}
/*
if the number is 325.......then, if we divide the number with 10, as they are decimal number. Then always we will get the reminder
of the number. Which will be the last digit of the number. And after that,  if divide the bhagfol with 10 again, then we will get the reminder again the last digit.
if we sum the reminder then we will get the sum of the all digits of the number.
*/