package UTS;

public class SlotParkir {
    private int nomor;
    private Kendaraan kendaraan;

    public SlotParkir(int nomor) {
        this.nomor = nomor;
    }

    public int getNomor() { return nomor; }

    public boolean parkir(Kendaraan kendaraan) {
        if (kendaraan == null || !isKosong()) return false;
        this.kendaraan = kendaraan;
        return true;
    }

    public boolean isKosong() {
        return kendaraan == null;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public Kendaraan keluarkanKendaraan() {
        Kendaraan keluar = kendaraan;
        kendaraan = null;
        return keluar;
    }
}
