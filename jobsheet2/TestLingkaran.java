package jobsheet2;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.phi = 3.14;
        l.r = 7;

        System.out.println("Jari-jari : " + l.r);
        System.out.println("Luas      : " + l.hitungLuas());
        System.out.println("Keliling  : " + l.hitungKeliling());
    }
}
