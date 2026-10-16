package UTS;

public class Mobil extends Kendaraan {
    private boolean denganSopir;
    private static final int BIAYA_SOPIR = 150000;

    public Mobil(String platNomor, String merk, int tarifHarian, boolean denganSopir) {
        super(platNomor, merk, tarifHarian);
        this.denganSopir = denganSopir;
    }

    public boolean isDenganSopir() { return denganSopir; }

    @Override
    public int hitungSewa() {
        int total = super.hitungSewa();
        if (denganSopir) {
            total += BIAYA_SOPIR;
        }
        return total;
    }

    @Override
    public String getJenis() { return "Mobil"; }
}
