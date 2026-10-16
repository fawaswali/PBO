package latihan;

public class Pesanan {
    private String kodePesanan;
    private Item[] daftarItem; // Deklarasi Array of Object

    public Pesanan(String kodePesanan, int kapasitas) {
        this.kodePesanan = kodePesanan;
        this.daftarItem = new Item[kapasitas]; // 1. BIKIN WADAH ARRAY DULU
    }

    // Memasukkan elemen ke indeks tertentu
    public void tambahItem(Item item, int index) {
        if (index >= 0 && index < daftarItem.length) {
            daftarItem[index] = item;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    // Looping hitung total dengan Guard Clause (cegah NullPointerException)
    public int hitungTotal() {
        int total = 0;
        for (Item item : daftarItem) {
            if (item != null) { // WAJIB CEK: slot array mungkin belum terisi penuh
                total += item.getHarga();
            }
        }
        return total;
    }

    // Looping cetak data dengan delegasi method
    public void info() {
        System.out.println("Kode Pesanan: " + kodePesanan);
        System.out.println("Daftar Item :");
        for (int i = 0; i < daftarItem.length; i++) {
            if (daftarItem[i] != null) { // WAJIB CEK NULL
                System.out.print((i + 1) + ". ");
                daftarItem[i].info(); // Delegasi cetak ke method milik Item
            }
        }
        System.out.println("Total Bayar : Rp" + hitungTotal());
    }
}
