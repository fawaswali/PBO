package Teori_5;

public class Main_Laptop {
    
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop("Dell", 16, 3, "Epson L3110");
        Laptop laptop1 = new Laptop("Asus", 8, 2, 15);

        desktop1.showInfo();
        laptop1.showInfo();

        desktop1.nyalakanKomputer();
    }
}
