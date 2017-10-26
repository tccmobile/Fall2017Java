import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<ItemToPurchase>();

    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<ItemToPurchase>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item){

    }

    public void removeItem(String itemName){


    }

    public void modifyItem(ItemToPurchase item){

    }

    public int getNumItemsInCart(){

        return 0;
    }

    public int getCostOfCart(){

        return 0;
    }

    public void printTotal(){

    }

    public void printDescriptions(){

    }
}
