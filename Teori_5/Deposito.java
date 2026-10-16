package Teori_5;

public class Deposito extends Rekening {
    private double BungaPerBulan;
    private long Tenor;

    public Deposito(long saldoAwal, long masaTenor) {
        Saldo = saldoAwal;
        Tenor = masaTenor;
        BungaPerBulan = 0.05; // Default 5%
    }

    public double getNilaiBunga() {
        double nilaiBunga;
        nilaiBunga = Saldo * BungaPerBulan * Tenor / 12;
        return nilaiBunga;
    }
}
