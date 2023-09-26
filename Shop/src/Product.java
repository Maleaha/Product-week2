//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 1;
    private Date manufactureDate;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity, Date manufactureDate) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufactureDate = manufactureDate;
    }

    public String toString() {
        String prodDetails = String.format("%d %-10s\t %.1f %5d %10s", this.id, this.name, this.price, this.quantity, this.manufactureDate.toString());
        return prodDetails;
    }

    public Product recentProd(Product obj1, Product obj2) {
        Date latest = this.manufactureDate.Recent(obj1.manufactureDate, obj2.manufactureDate);
        return latest == obj1.manufactureDate ? obj1 : obj2;
    }
}
