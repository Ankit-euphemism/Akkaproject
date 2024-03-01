import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[]args) {

        Scanner r = new Scanner (System.in);

        System.out.println("Enter 0 for rock\nEnter 1 for paper\nEnter 2 for scissors");
        int userInput = r.nextInt ();
        Random k = new Random ();
        int computerInput = k.nextInt ();

        if (computerInput == userInput) {
            System.out.println ("Draw");
        } else if (userInput==0 && computerInput==2||userInput==1 && computerInput==0||userInput==2 && computerInput==1) {
            System.out.println ("You win");
        } else {
            if (computerInput == 0) {
                System.out.println ("computer choice: Rock");
            } else if (computerInput == 1) {
                System.out.println ("computer choice: Paper");
            } else if (computerInput == 2) {
                System.out.println ("computer choice: Scissors");
            }
            System.out.println ("Computer win");
        }


    }

}