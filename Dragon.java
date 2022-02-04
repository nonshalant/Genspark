import java.util.Scanner;

public class Dragon{
    public static String main(String[] args) {
        try{
            System.out.println("You are in a land full of dragons. In front of you, you see two caves." +
                    " In one cave, the dragon is friendly and will share his treasure with you." +
                    "The other dragon is greedy and hungry and will eat you on sight. " +
                    "Which Cave will you go in (0 , 1, 2)");

            Scanner getInput = new Scanner(System.in);
            int input = getInput.nextInt();

            if (input == 1) {
                System.out.println("You entered cave 1 and have been eaten by the dragon! Would you like to play again? (yes or no)");
            } else if (input == 2) {
                System.out.println("You entered cave 2 CONGRATS!! YOU'RE RICH! :D  Would you like to play again? (yes or no)");
            } else if (input == 0) {
                System.out.println(" You exited the cave. Would you like to play again? (yes or no)");
            }
        }catch (Exception e){
            return "Caught Exception: Something went wrong";
        }

        return null;
    }
}
