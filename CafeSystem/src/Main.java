
public class Main {
    public static void main(String[] args) {

        // Creating an instance of MenuItem

        MenuItem hotChocolate = new MenuItem("Hot Chocolate", 3.50, "Beverage");
        MenuItem Donut = new MenuItem("Donut", 3.00, "Food");
        MenuItem Cappuccino = new MenuItem("Cappuccino", 6.50, "Beverage");
        Order order = new Order(hotChocolate, Donut, Cappuccino);
        Cafe cafe = new Cafe();

        // Adding the items to the first, second, and third slot as requested
        cafe.addMenuItem1(hotChocolate);
        cafe.addMenuItem2(Donut);
        cafe.addMenuItem3(Cappuccino);
        cafe.displayMenu();
        cafe.placeOrder(order);
        double totalAmount = order.getTotalAmount();
        System.out.println("Total amount:" + " $" + totalAmount);

    }
}