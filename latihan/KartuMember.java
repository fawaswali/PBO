package latihan;

public class KartuMember {
    private String nomorKartu;
    private double diskon;
    private Anggota pemilik;

    public KartuMember (String nomorKartu,double diskon , Anggota pemilik) {
        this.nomorKartu = nomorKartu;
        this.diskon = diskon;
        this.pemilik = pemilik;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public double getDiskon () {
        return diskon;

    }

    public Anggota getPemilik () {
        return pemilik;
    }

    public void info () {
        System.out.println("nomor kartu : " + nomorKartu);
        System.out.println("diskon : " + diskon);
        pemilik.info();
        
    }
}
