package Teori_4;

public class SepedaMotor {
    private String Merek;
    private String Warna;
    private int MaxSpeed;
    private int KecepatanSekarang;
    private Mesin MesinMotor; // HAS-A (Aggregation)

    public SepedaMotor(String merek, String warna, int maxSpeed, Mesin mesinMotor) {
        this.Merek = merek;
        this.Warna = warna;
        this.MaxSpeed = maxSpeed;
        this.KecepatanSekarang = 0;
        this.MesinMotor = mesinMotor;
    }

    // Behavior: Menambah kecepatan dengan validasi batas atas (Defensive Programming)
    public void tambahKecepatan(int delta) {
        if (delta <= 0) {
            System.out.println("Nilai penambahan kecepatan harus lebih dari 0!");
            return;
        }

        if (KecepatanSekarang + delta > MaxSpeed) {
            KecepatanSekarang = MaxSpeed;
            System.out.println("Kecepatan mencapai batas maksimal: " + MaxSpeed + " km/jam");
        } else {
            KecepatanSekarang += delta;
            System.out.println("Kecepatan bertambah menjadi: " + KecepatanSekarang + " km/jam");
        }
    }

    // Behavior: Mengurangi kecepatan dengan validasi batas bawah (Defensive Programming)
    public void kurangiKecepatan(int delta) {
        if (delta <= 0) {
            System.out.println("Nilai pengurangan kecepatan harus lebih dari 0!");
            return;
        }

        if (KecepatanSekarang - delta < 0) {
            KecepatanSekarang = 0;
            System.out.println("Sepeda motor telah berhenti total (0 km/jam).");
        } else {
            KecepatanSekarang -= delta;
            System.out.println("Kecepatan berkurang menjadi: " + KecepatanSekarang + " km/jam");
        }
    }

    // Relasi USES-A: SPBU hanya lewat sebagai parameter method
    public void isiBensin(SPBU pompa, double liter) {
        // Defensive Programming: Null checking
        if (pompa != null) {
            pompa.isiBahanBakar(this.Merek, liter);
        } else {
            System.out.println("SPBU tidak valid atau tidak ditemukan!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("=== Data Sepeda Motor ===");
        System.out.println("Merek             : " + Merek);
        System.out.println("Warna             : " + Warna);
        System.out.println("Kecepatan Maksimal: " + MaxSpeed + " km/jam");
        System.out.println("Kecepatan Saat Ini: " + KecepatanSekarang + " km/jam");

        // Defensive Programming: Null checking pada objek relasi
        if (MesinMotor != null) {
            MesinMotor.tampilkanInfo();
        } else {
            System.out.println("Mesin             : Belum terpasang!");
        }
        System.out.println("=========================\n");
    }

    // Getter dan Setter
    public String getMerek() {
        return Merek;
    }

    public void setMerek(String merek) {
        this.Merek = merek;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        this.Warna = warna;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.MaxSpeed = maxSpeed;
    }

    public int getKecepatanSekarang() {
        return KecepatanSekarang;
    }

    public Mesin getMesinMotor() {
        return MesinMotor;
    }

    public void setMesinMotor(Mesin mesinMotor) {
        this.MesinMotor = mesinMotor;
    }
}