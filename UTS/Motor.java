package UTS;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String platNomor, String merk, int tarifHarian, int cc) {
        super(platNomor, merk, tarifHarian);
        this.cc = cc;
    }

    public int getCc() { return cc; }

    @Override
    public int hitungSewa() {
        int total = super.hitungSewa();
        if (hariSewa > 7) {
            total = (int) Math.round(total * 0.9);
        }
        return total;
    }

    @Override
    public String getJenis() { return "Motor"; }
}
