import java.util.Scanner;

public class ParseStrings {
    public static void main(String arg[]){
        Scanner scnr = new Scanner(System.in);
        String userInput = "?";

        while (!userInput.equals("q")) {
            System.out.println("Enter input string:");
            userInput = scnr.nextLine();

            if (userInput.equals("q")){
                break;
            }
            while (!userInput.contains(",")) {
                System.out.println("Error: No comma in string.\n");
                System.out.println("Enter input string:");
                userInput = scnr.nextLine();
            }

            String firstWord = userInput.substring(0, userInput.indexOf(',')).trim();
            String secondWord = userInput.substring(userInput.indexOf(',') + 1, userInput.length()).trim();

            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            System.out.println();
        }
        return;
    }
}
