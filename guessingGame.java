import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class guessingGame {
    public static void main(String[] args) {
        try{
            //creating random number
            Random randomNum = new Random();
            int numb = randomNum.nextInt(20);

            //game start
            System.out.println("Hello What is Your Name");

            // get userName
            Scanner userInput = new Scanner(System.in);
            String userName = userInput.nextLine();

            // Question
            System.out.println(String.format("Well, %s , I am thinking of a number between 1 and 20.. " +
                    "TAKE A GUESS", userName));

            int attempts = 6;

            for( int i = 0; i < attempts; i++){
                //Answer
                Scanner userAnswer = new Scanner(System.in);
                String guessOne = userAnswer.nextLine();
                int answer = parseInt(guessOne);

                if(i != attempts){
                    if(answer == numb){
                        System.out.println("GOOD GUESSING!! :D");
                    }else if(answer < numb){
                        System.out.println("Too Low.. TRY AGAIN!!");
                    }else if(answer > numb){
                        System.out.println("Too High.. TRY AGAIN!!");
                    }
                    if(i == 6){
                        System.out.println("GAME OVER OUT OF GUESSES");
                    }
                }

            }

        }catch(Exception e){
            return "Caught Exception: Something went wrong";
        }

    }
}
