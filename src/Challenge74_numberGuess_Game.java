import java.util.Scanner;
public class Challenge74_numberGuess_Game {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double attempt = 0;
        double correctGuessCount =0;
        System.out.println("Welcome to Guess number Game!.......");
        System.out.println("Enter 1 to 10 numbers.......");
        System.out.println("Enter 100 if you want to exit.......");
        while (true){

            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == 100){
                System.out.println("Exit form the Game.");
                break;
            }

            attempt++;

            int num = (int)Math.ceil(Math.random()*10);
            if (guess == num){
                System.out.println("\n\nCongratulation! your guess is correct!\n\n");
                correctGuessCount++;
            }else {
                System.out.println("Wrong guess! The correct number was: "+num);
            }
        }
        System.out.println("Your Total attempt: "+ attempt);
        System.out.println("Your Total Correct Guess: "+ correctGuessCount);
        double success = ((correctGuessCount/attempt)*100);
        System.out.println("Success rate: "+ success + " %");
        input.close();
    }
}