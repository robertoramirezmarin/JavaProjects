import java.util.Scanner;
public class Hilo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        String playAgain = ""; 
        do {
            int theNumber = (int)(Math.random() * 100 + 1); 
            int guess = 0; 
            while (guess != theNumber){
                System.out.println("Guess a number between 1 and 100: ");
                guess = scan.nextInt(); 
                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try Again. ");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try Again. ");
                else 
                    System.out.println(guess + " is correct. You win!");

            }

            System.out.println("Would you like to play again (Y/N)?");
            playAgain = scan.next(); 

        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank for playing! Goodbye.");
        scan.close();
    }
}
