package jobsheet4.tugas;

// 3. Kelas Nota (Mengandung Aggregation dan Composition)
public class Nota {
    private String noNota;
    private Pelanggan pelanggan;             // AGGREGATION: referensi disuntikkan dari luar
    private TransaksiItem item;               // COMPOSITION: dibuat di dalam kelas Nota

    public Nota(String noNota, Pelanggan pelanggan, String namaBarang, double harga) {
        this.noNota = noNota;
        this.pelanggan = pelanggan;
        // COMPOSITION: Nota membuat dan mengontrol siklus hidup objek item sendiri
        this.item = new TransaksiItem(namaBarang, harga);
    }

    public String getStruk() {
        return "No: " + noNota + " | Pembeli: " + pelanggan.getNama() + " | Item: " + item.getDetail();
    }
}
