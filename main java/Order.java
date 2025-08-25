import java.awt.*;

public class Order {
    public MenuItem menuItem1;
    public MenuItem menuItem2;
    public MenuItem menuItem3;
    public double totalAmount;

    public void addItem1(MenuItem item){
        this.menuItem1 = item;
    }
    public void addItem2(MenuItem item){
        this.menuItem2 = item;
    }
    public void addItem3(MenuItem item){
        this.menuItem3 = item;
    }
    public double calculateTotal(){
        totalAmount += menuItem1.getPrice();
        totalAmount += menuItem2.getPrice();
        totalAmount += menuItem3.getPrice();
        return totalAmount;
    }
    public void displayOrderDetails(){
        System.out.println("Order details: ");
        menuItem1.DisplayItemInfo();
        menuItem2.DisplayItemInfo();
        menuItem3.DisplayItemInfo();
        System.out.println();
    }
}
