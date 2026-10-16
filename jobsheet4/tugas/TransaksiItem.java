package jobsheet4.tugas;

// 2. Kelas TransaksiItem (Bagian Composition)
public class TransaksiItem {
    private String namaBarang;
    private double harga;

    public TransaksiItem(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getDetail() {
        return namaBarang + " - Rp" + harga;
    }
}
