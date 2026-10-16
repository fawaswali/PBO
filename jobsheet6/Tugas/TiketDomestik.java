package jobsheet6.Tugas;

public class TiketDomestik extends TiketPesawat {
    protected int pajakBandara;

    public TiketDomestik() {
        super();
    }

    public TiketDomestik(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        System.out.println("======== Tiket Pesawat Domestik ========");
        super.tampilPesawat();
        System.out.println("Pajak Bandara  = " + pajakBandara);
        int totalBayar = getHargaDasar() + hitungBiayaBagasi() + pajakBandara;
        System.out.println("Total Bayar    = " + totalBayar);
        System.out.println();
    }
}
