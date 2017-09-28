import java.util.Scanner;

public class loopDemo {

    public static void main(String arg[]){

       char quitChar;
        Scanner scanner = new Scanner(System.in);

       do {
           System.out.println("Enter stuff - q to quit");
           quitChar = scanner.next().charAt(0);

       } while(quitChar!='q');

        System.out.println("Thanks for using my program!");
    }
}
