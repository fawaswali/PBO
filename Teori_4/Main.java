package Teori_4;

public class Main {
    public static void main(String[] args) {
        // 1. Buat objek Mesin (Part)
        Mesin mesinBeat = new Mesin(110, "Bensin Oktan 92");

        // 2. Buat objek SepedaMotor dan kaitkan objek Mesin (Whole)
        SepedaMotor motor = new SepedaMotor("Honda Vario", "Hitam", 115, mesinBeat);

        // Tampilkan informasi awal
        motor.tampilkanInfo();

        // 3. Uji perilaku akselerasi dan deselerasi
        motor.tambahKecepatan(50);
        motor.tambahKecepatan(80); // Menguji defensive programming batas MaxSpeed
        motor.kurangiKecepatan(30);
        motor.kurangiKecepatan(150); // Menguji defensive programming batas minimum (0 km/jam)

        System.out.println();

        // 4. Uji relasi USES-A dengan class SPBU
        SPBU spbuPertamina = new SPBU("Pertamina Soekarno-Hatta");
        motor.isiBensin(spbuPertamina, 3.5);
    }
}
