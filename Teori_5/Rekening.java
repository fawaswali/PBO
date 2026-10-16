package Teori_5;

public class Rekening {
    protected long Saldo;

    public long getSaldo() {
        return Saldo;
    }

    public void simpanUang(long jumlah) {
        Saldo = Saldo + jumlah;
    }

    public void ambilUang(long jumlah) {
        Saldo = Saldo - jumlah;
    }
}
