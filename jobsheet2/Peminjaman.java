package jobsheet2;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double harga;

    public double hitungHargaBayar() {
        return lamaSewa * harga;
    }

    public void tampilDataPeminjaman() {
        System.out.println("ID Transaksi : " + id);
        System.out.println("Nama Member  : " + namaMember);
        System.out.println("Nama Game    : " + namaGame);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Bayar  : Rp " + hitungHargaBayar());
    }
}
