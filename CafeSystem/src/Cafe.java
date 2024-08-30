public class Cafe {
    //Creating the objects for the MenuItem and Order which will serve as the items and then like the currentOrder
    // of what the customer is ordering in the cafe.
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private Order currentOrder;

    //These methods essentially add where the item will be in the menu so like if its the first item or second
    //Based on where we put it when we add it in the Main class

    public void addMenuItem1(MenuItem item1) {
        this.item1 = item1;

    }
    public void addMenuItem2(MenuItem item2){
        this.item2 = item2;
    }
    public void addMenuItem3(MenuItem item3){
        this.item3 = item3;
    }
    //This method pulls upon the Order class that I made that has the calculateTotal method which adds
    //all the doubles together for the price, additonally this.currentOrder = order; is to make sure
    //that the most updated order is being used instead of a later order. That way it is always being updated
    public void placeOrder(Order order){
        this.currentOrder = order;
        this.currentOrder.calculateTotal();
    }
    public void displayMenu(){
        System.out.println("Menu Options Are:");
        System.out.println("Item 1: " + item1.getName() + ", " + "$" + item1.getPrice() + ", " + item1.getCategory());
        System.out.println("Item 2: " + item2.getName() + ", " + "$" + item2.getPrice() + ", " + item2.getCategory());
        System.out.println("Item 3: " + item3.getName() + ", " + "$" + item3.getPrice() + ", " + item3.getCategory());
    }
}
