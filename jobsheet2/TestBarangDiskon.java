package jobsheet2;

public class TestBarangDiskon {
    public static void main(String[] args) {
        BarangDiskon b = new BarangDiskon();
        b.kode = "B001";
        b.namaBarang = "Keyboard ";
        b.hargaDasar = 500000;
        b.diskon = 10;

        b.tampilData();
    }
}
