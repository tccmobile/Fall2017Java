import java.util.Scanner;

public class PlayerRoster {

    public static void main(String arg[]){

        final int NUM_PLAYERS = 5;

        int[] jerseyNumbers = new int[NUM_PLAYERS];
        int[] playerRatings = new int[NUM_PLAYERS];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_PLAYERS ; i++) {
            System.out.println("Enter player "+(i+1)+"'s jersey number:");
            jerseyNumbers[i] = scanner.nextInt();
            System.out.println("Enter player "+(i+1)+"'s rating:");
            playerRatings[i] = scanner.nextInt();
            System.out.println();
        }



        char userChoice= '?';

        do{
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println();
            System.out.print("Choose an option:");
            userChoice = scanner.next().charAt(0);

            if (userChoice=='o'){
                System.out.println("ROSTER");
                for (int i = 0; i < NUM_PLAYERS; i++) {
                    System.out.println("Player " +(i+1)+" -- Jersey number: "+jerseyNumbers[i]+", Rating: "+playerRatings[i]);
                }
            }

        } while (userChoice!='q');
    }
}




