package UTS;

public class Garasi {
    private String nama;
    private SlotParkir[] daftarSlot;
    private Mekanik kepala;

    public Garasi(String nama, int jumlahSlot) {
        if (jumlahSlot <= 0) throw new IllegalArgumentException("Jumlah slot harus positif.");
        this.nama = nama;
        this.daftarSlot = new SlotParkir[jumlahSlot];
        for (int i = 0; i < jumlahSlot; i++) {
            daftarSlot[i] = new SlotParkir(i + 1);
        }
    }

    public void setKepalaMekanik(Mekanik kepala) {
        this.kepala = kepala;
    }

    // Overloading: parkir pada slot kosong pertama.
    public boolean parkir(Kendaraan kendaraan) {
        for (SlotParkir slot : daftarSlot) {
            if (slot.isKosong()) {
                return slot.parkir(kendaraan);
            }
        }
        System.out.println("Garasi penuh. Kendaraan tidak dapat diparkir.");
        return false;
    }

    // Overloading: parkir pada nomor slot tertentu (nomor dimulai dari 1).
    public boolean parkir(Kendaraan kendaraan, int nomorSlot) {
        SlotParkir slot = getSlot(nomorSlot);
        if (slot == null) {
            System.out.println("Nomor slot tidak valid: " + nomorSlot);
            return false;
        }
        if (!slot.isKosong()) {
            System.out.println("Slot " + nomorSlot + " sudah terisi.");
            return false;
        }
        return slot.parkir(kendaraan);
    }

    public SlotParkir getSlot(int nomor) {
        if (nomor < 1 || nomor > daftarSlot.length) return null;
        return daftarSlot[nomor - 1];
    }

    public void tampilInfo() {
        System.out.println("Garasi: " + nama);
        System.out.println("Kepala mekanik: " + (kepala == null ? "Belum ditentukan" : kepala.getNama()));
        System.out.println("Keahlian: " + (kepala == null ? "-" : kepala.getKeahlian()));
        System.out.println("Daftar slot:");
        for (SlotParkir slot : daftarSlot) {
            System.out.print("Slot " + slot.getNomor() + ": ");
            if (slot.isKosong()) {
                System.out.println("Kosong");
            } else {
                System.out.println(slot.getKendaraan().getJenis() + " - " + slot.getKendaraan().getPlatNomor());
            }
        }
    }
}
