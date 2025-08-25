import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Test Class
        MenuItem coffee = new MenuItem("Coffee", 4.00, "Drink");
        MenuItem pie = new MenuItem("Slice of cherry pie", 3.97, "Food");
        MenuItem croissant = new MenuItem("Croissant", 2.49, "Food");
        MenuItem soda = new MenuItem("Coca cola", 2.89, "Drink");
        MenuItem burger = new MenuItem("Hamburger", 6.39, "Food");
        MenuItem fries = new MenuItem("French fries", 1.70, "Side");

        Order order1 = new Order();
        Cafe coffee_shop = new Cafe();
        coffee_shop.addMenuItem1(coffee);
        coffee_shop.addMenuItem2(pie);
        coffee_shop.addMenuItem3(croissant);

        coffee_shop.displayMenu();

        order1.addItem1(pie);
        order1.addItem2(pie);
        order1.addItem3(pie);
        order1.displayOrderDetails();

        coffee_shop.placeOrder(order1);

        Cafe fast_food = new Cafe();
        fast_food.addMenuItem1(soda);
        fast_food.addMenuItem2(burger);
        fast_food.addMenuItem3(fries);

        fast_food.displayMenu();

        Order order2 = new Order();
        order2.addItem1(soda);
        order2.addItem2(burger);
        order2.addItem3(fries);

        fast_food.placeOrder(order2);
    }
}