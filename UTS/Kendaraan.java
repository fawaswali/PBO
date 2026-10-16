package UTS;

public class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected int tarifHarian;
    protected int hariSewa;
    private Pelanggan penyewa;

    public Kendaraan(String platNomor, String merk, int tarifHarian) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tarifHarian = tarifHarian;
    }

    public void setPenyewa(Pelanggan penyewa) {
        this.penyewa = penyewa;
    }

    public Pelanggan getPenyewa() {
        return penyewa;
    }

    public void setHariSewa(int hariSewa) {
        if (hariSewa <= 0) {
            throw new IllegalArgumentException("Hari sewa harus lebih dari 0.");
        }
        this.hariSewa = hariSewa;
    }

    public int getHariSewa() {
        return hariSewa;
    }

    public int hitungSewa() {
        return tarifHarian * hariSewa;
    }

    public String getJenis() {
        return "Kendaraan";
    }

    public String getPlatNomor() { return platNomor; }
    public String getMerk() { return merk; }
    public int getTarifHarian() { return tarifHarian; }

    public void tampilInfo() {
        System.out.println("Jenis: " + getJenis());
        System.out.println("Plat nomor: " + platNomor);
        System.out.println("Merek: " + merk);
        System.out.println("Tarif harian: Rp" + tarifHarian);
        System.out.println("Hari sewa: " + hariSewa);
        System.out.println("Penyewa: " + (penyewa == null ? "Belum ada" : penyewa.getNama()));
        System.out.println("Total sewa: Rp" + hitungSewa());
    }
}
