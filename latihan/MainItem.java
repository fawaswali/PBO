package latihan;

public class MainItem {
    public static void main(String[] args) {
        // Buat pesanan dengan kapasitas 3 item
        Pesanan p = new Pesanan("ORD-01", 3);

        // Isi slot array
        p.tambahItem(new Item("Ayam Geprek", 15000), 0);
        p.tambahItem(new Item("Es Teh Manis", 5000), 1);
        // Slot indeks ke-2 sengaja dibiarkan kosong untuk uji guard clause null

        // Tampilkan
        p.info();
    }
}
