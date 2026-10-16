package latihan;

public class Item {
    private String nama;
    private int harga;

    public Item(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void info() {
        System.out.println("  - " + nama + " (Rp" + harga + ")");
    }
}
