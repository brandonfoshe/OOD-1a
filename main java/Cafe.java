public class Cafe {
    public MenuItem menuItem1;
    public MenuItem menuItem2;
    public MenuItem menuItem3;
    public Order currentOrder;

    public void addMenuItem1(MenuItem item){
        this.menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item){
        this.menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item){
        this.menuItem3 = item;
    }
    public void placeOrder(Order order){
        this.currentOrder = order;
        System.out.println("Total: " + order.calculateTotal());
        System.out.println("Order closed");
    }
    public void displayMenu(){
        System.out.println("Menu: ");
        menuItem1.DisplayItemInfo();
        menuItem2.DisplayItemInfo();
        menuItem3.DisplayItemInfo();
        System.out.println();
    }
}
