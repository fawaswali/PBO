package latihan;

public class Mobil {
    private String merk;
    private Mesin mesin;

    // PERBAIKAN:
    public Mobil (String merk, String tipeMesin, int ccMesin) {
        this.merk = merk;
        this.mesin = new Mesin(tipeMesin, ccMesin); // Instansiasi langsung di dalam!
    }

    public  String getMerk () {
        return merk;
    }

    public Mesin getMesin () {
        return mesin;
    }

    public void info () {
        System.out.println("Merk : " + merk);
        System.out.println("Mesin : " + mesin);
        mesin.Info();
    }
}
