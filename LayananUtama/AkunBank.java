package LayananUtama;

public class AkunBank {

    public String nomorAkun;
    protected double tingkatBunga;

    public AkunBank(String nomorAkun, double tingkatBunga) {
        this.nomorAkun = nomorAkun;
        this.tingkatBunga = tingkatBunga;
    }

    protected void sesuaikanBunga(double bungaBaru) {
        this.tingkatBunga = bungaBaru;
        System.out.println("Tingkat bunga untuk akun " + nomorAkun + "disesuaikan menjadi: " + tingkatBunga + "%");
    }
}