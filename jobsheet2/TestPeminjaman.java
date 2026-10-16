package jobsheet2;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = "PM001";
        p.namaMember = "Andi";
        p.namaGame = "FIFA 24";
        p.lamaSewa = 3;
        p.harga = 25000;

        p.tampilDataPeminjaman();
    }
}