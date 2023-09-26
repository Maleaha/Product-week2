
public class ProductTest {
    public ProductTest() {
    }

    public static void main(String[] args) {
        Product obj1 = new Product("icecream", 90.0, 2, new Date(19, 7, 2022));
        Product obj2 = new Product("chips", 45.0, 10, new Date(4, 4, 2029));
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println("--------------------------------------------------------------------");

        Product latest = obj1.recentProd(obj1, obj2);
        System.out.println("lastest: "+latest);
    }
}

