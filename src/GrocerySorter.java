import java.util.Scanner;

public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};
    public static void main (String [] args) {

        GroceryItem userItem = GroceryItem.GR_APPLES;

      /* Your solution goes here  */

      switch (userItem){
          case GR_JUICE:
          case GR_WATER:
              System.out.println("Drink");
              break;
          case GR_APPLES:
          case GR_BANANAS:
              System.out.println("Fruit");
              break;
      }

        return;
    }
}