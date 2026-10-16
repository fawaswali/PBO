public class KipasAngin {
    private String merk;
    private int levelKecepatan;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void aturKecepatan(int level) {
        this.levelKecepatan = level;
    }

    public void cetakInformasi() {
        System.out.println("Merk Kipas: " + merk);
        System.out.println("Level Kecepatan: " + levelKecepatan);
    }
}
