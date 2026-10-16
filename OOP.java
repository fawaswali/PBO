class Product{
    private final String itemName;
    private final float price;
    //penambahan variasi
    static int totbrg=0; //penambahan variasi

    public Product (String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        totbrg++; //penambahan variasi
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public static void totBelanjaan() {
        System.out.println("Total belanjaan = "+totbrg); //penambahan method
    }

    public String getName() {
        return itemName;
    }
}



public class OOP {
    public static void main(String[] args) {
        Product product1 = new Product("Coffe", 12000.0f);
        Product product2 = new Product("Sugar", 30000.0f);

        System.out.println(product1.getName() + ": " + product1.total(3));
        System.out.println(product2.getName() + ": " + product2.total(1));
        Product.totBelanjaan();// total belanjaan

    }
    
}
