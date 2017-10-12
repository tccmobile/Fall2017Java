import java.util.Scanner;

public class TextAnalyzer {
    // Method counts the number of characters
    public static int getNumOfCharacters(final String usrStr) {
      /* Type your code here. */
      int totalChar = 0;

        for (int i = 0; i < usrStr.length(); i++) {
            totalChar++;
        }
        //return usrStr.length();
        return totalChar;
    }

    public static void outputWithoutWhitespace(final String usrStr){

        System.out.print("String with no whitespace: ");
        for (int i = 0; i <usrStr.length() ; i++) {
            if ((usrStr.charAt(i)!=' ') && (usrStr.charAt(i)!='\t')){
                System.out.print(usrStr.charAt(i));
            }
        }
        System.out.println();

        return;
    }
    public static void main(String[] args) {
      /* Type your code here. */

      Scanner scanner = new Scanner(System.in);
      String usrStr;
      int totalChar = 0;
        System.out.println("Enter a sentence or phrase:");
        usrStr = scanner.nextLine();
        System.out.println();
        System.out.println("You entered: "+usrStr);
        System.out.println();
        totalChar = getNumOfCharacters(usrStr);
        System.out.println("Number of characters: "+totalChar);
        outputWithoutWhitespace(usrStr);
        return;
    }
}