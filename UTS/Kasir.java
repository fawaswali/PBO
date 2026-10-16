package UTS;

public class Kasir {
    private String nama;

    public Kasir(String nama) {
        this.nama = nama;
    }

    // Dependency: Kendaraan hanya digunakan sebagai parameter, tidak disimpan sebagai atribut.
    public void cetakNota(Kendaraan kendaraan) {
        System.out.println("Kasir: " + nama);
        System.out.println("========== NOTA SEWA ==========");
        System.out.println("Jenis: " + kendaraan.getJenis());
        System.out.println("Plat nomor: " + kendaraan.getPlatNomor());
        System.out.println("Merek: " + kendaraan.getMerk());
        System.out.println("Penyewa: " + (kendaraan.getPenyewa() == null ? "Belum ditentukan" : kendaraan.getPenyewa().getNama()));
        System.out.println("Lama sewa: " + kendaraan.getHariSewa() + " hari");
        System.out.println("Total: Rp" + kendaraan.hitungSewa());
        System.out.println("===============================");
    }
}
