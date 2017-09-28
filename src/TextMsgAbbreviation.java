import java.util.Scanner;

/**
 * Created by t10115885 on 9/14/17.
 */
public class TextMsgAbbreviation {
    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);
        String abbr = "";

        System.out.println("Input an abbreviation:");
        abbr=scnr.next();

        if (abbr.equals("LOL")){
            System.out.println("laughing out loud");
        } else if (abbr.equals("IDK")){
            System.out.println("I don't know");
        } else if (abbr.equals("BFF")){
            System.out.println("best friends forever");
        } else  if (abbr.equals("IMHO")){
            System.out.println("in my humble opinion");
        } else if (abbr.equals("TMI")){
            System.out.println("too much information");
        } else {
            System.out.println("Unknown");
        }
    }
}
