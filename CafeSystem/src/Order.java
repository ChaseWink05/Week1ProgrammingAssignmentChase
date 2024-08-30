public class Order {
    //Required objects and variable, creating an instance of MenuItem called item1, item 2 etc which we will add to the order
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;
    /*Constructor that initializes the objects for the menu items. For this constructor we are saying it needs
    * to have 3 items per order.  */
    public Order(MenuItem item1, MenuItem item2, MenuItem item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }
    //Adding the items to the first, second, and third slot as requested just assigning what item is where
    //Ex. item1 could be a tea, and item2 could be coffee both with prices and categories if thats what we
    //set them to in the Main.java
    public void addItem1(MenuItem item1){
        this.item1 = item1;
    }
    public void addItem2(MenuItem item2){
        this.item2 = item2;
    }
    public void addItem3(MenuItem item3){
        this.item3 = item3;
    }
    /*getPrice() from the MenuItem class which returns the double variable of each item that the user
    adds from the Main.java. We are adding all the prices together */
    public void calculateTotal(){
        totalAmount = item1.getPrice() + item2.getPrice() + item3.getPrice();
    }
    public void displayOrderDetails(){
        System.out.println("Item 1: " + item1.getName() + ", " + item1.getPrice() + " " + item1.getCategory());
        System.out.println("Item 2: " + item2.getName() + ", " + item2.getPrice() + " " + item2.getCategory());
        System.out.println("Item 3: " + item3.getName() + ", " + item3.getPrice() + " " + item3.getCategory());
        System.out.println("The total amount is " + totalAmount);
    }
//Getters and Setters to get and set the objects since they are private variables
    public MenuItem getMenuItem1() {
        return item1;
    }
    public void setMenuItem1(MenuItem item1) {
        this.item1 = item1;
    }
    public MenuItem getMenuItem2() {
        return item2;
    }
    public void setMenuItem2(MenuItem item2){
        this.item2 = item2;
    }
    public MenuItem getMenuItem3() {
        return item3;
    }
    public void setMenuItem3(MenuItem item3){
        this.item3 = item3;
    }
    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public double getTotalAmount(){
        return totalAmount;
    }

}
