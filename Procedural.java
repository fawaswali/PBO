public class Procedural{
    public static void main(String[] args) {
        String itemName1 = "Coffe";
        float price1 = 12000.0f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        float price2 = 300000.0f;
        int quantity2 = 1;

        System.out.println(itemName1 + ": " + total(price1,quantity1));
        System.out.println(itemName2 + ": " + total(price2,quantity2));
        
    }

    static float total(float price, int quantity){
        return price * quantity;
    }
}