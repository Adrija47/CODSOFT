import java.util.*;
public class Numbergame {
    public static void main(String[] args) throws InterruptedException{
        Random run= new Random();
        int lower_bound= 1;
        int upper_bound= 100;
        int maxguess= 10;
        int matchs= 1;
        int score= 0;
        int trial= 0;
        System.out.println("!**********~~~~~WELCOME TO THE NUMBER GAME~~~~~**********!");
        System.out.println("The Rules of this game are simple :- ");
        System.out.println("The machine will guess a random number between 1 to 100. You will have to guess that number. You will be getting 10 attempts to guess that number.");
        System.out.println("All The Best! May u guess it at the first attempt!");
        while(true){
            int token= run.nextInt(upper_bound - lower_bound + 1) - lower_bound;
            System.out.println("Wait! The Machine is thinking...");
            try { 
                Thread.sleep(2000);
            } catch(InterruptedException ex){ 
             
                System.exit(0); 
            }
            System.out.println("The Machine has thought of a number between " + lower_bound + " to " + upper_bound + ".");

            Scanner scan= new Scanner(System.in);
            for(trial=0; trial<maxguess; trial++){
                System.out.print("Enter your guess: ");
                int user_ip= scan.nextInt();
                if (user_ip==token){
                    System.out.println("Well Done!You have guessed the correct number");
                    score += maxguess- trial;
                    break;
                }
                else if (user_ip> token){
                    System.out.println("Your guess is too high!");
                }
                else if (user_ip< token){
                    System.out.println("Your guess is too low!");
                }
            }
            if (trial >= maxguess) {
                System.out.println("OOPs! You ran out of your chances. The correct number was: " + token + " Better luck next time!");
            }
            System.out.print("Do you want to play another round? [YES|NO]: ");
            String anotherround = scan.next();

            if (!anotherround.equalsIgnoreCase("yes")) {
                break;
            }
            matchs += 1;
        }
        System.out.println("Game Over!. Thankyou for playing.");
        System.out.println("This is the number of rounds you played: " + matchs);
        System.out.println("This is your score: " + score);

    



    }
        


}
