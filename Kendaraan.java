public class Kendaraan {
    private String merk;
    private int kecepatan;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tambahKecepatan(int increment) {
        this.kecepatan += increment;
    }

    public void cetakInformasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
