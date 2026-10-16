package jobsheet6.Tugas;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
        super();
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("======== Tiket Pesawat Internasional ========");
        super.tampilPesawat();
        System.out.println("Nomor Paspor   = " + nomorPaspor);
        System.out.println("Asuransi       = " + asuransi);
        int totalBayar = getHargaDasar() + hitungBiayaBagasi() + asuransi;
        System.out.println("Total Bayar    = " + totalBayar);
        System.out.println();
    }
}
