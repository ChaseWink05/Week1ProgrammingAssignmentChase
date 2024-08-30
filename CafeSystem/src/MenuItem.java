public class MenuItem {
    //The variables that will describe the menu item
    private String name;
    private double price;
    private String category;
    //Constructor to intialize the variables which will allow us to change them if need be later on in the program
    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;

    }
    //Getters and Setters for the private variables
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }
    public double getPrice(){

        return price;
    }
    public void setPrice(double price){

        this.price = price;
    }
    public String getCategory(){

        return category;
    }
    public void setCategory(String category){

        this.category = category;
    }
    //This function just simply print out the name, price and category of the item if we call upon it
    public void displayItemInfo(){
        System.out.println("Name of the item:" + name);
        System.out.println("The price of the item is" + "$"+ price);
        System.out.println("The category of the item: " + category);
    }

}
