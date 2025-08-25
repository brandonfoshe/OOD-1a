public class MenuItem {
    public String name;
    public double price;
    public String category;

    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void DisplayItemInfo(){
        System.out.println(category + " - " + name + " - " + price);
    }
}
