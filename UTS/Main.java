package UTS;

public class Main {
    public static void main(String[] args) {
        Garasi garasi = new Garasi("Rental Arjuno", 4);
        Mekanik mekanik = new Mekanik("Pak Jokmo", "Mesin");
        garasi.setKepalaMekanik(mekanik);

        Pelanggan dina = new Pelanggan("3555555", "Dina");

        Mobil mobil = new Mobil("N 1234 AB", "Toyota Avanza", 350000, true);
        mobil.setPenyewa(dina);
        mobil.setHariSewa(3);

        Motor motor = new Motor("5453 BB", "Honda Vario", 80000, 125);
        motor.setPenyewa(dina);
        motor.setHariSewa(7);

        // Parkir mobil di slot kosong pertama; motor pada slot nomor 4.
        garasi.parkir(mobil);
        garasi.parkir(motor, 4);

        Kasir kasir = new Kasir("Kasir 1");
        System.out.println("=== NOTA MOBIL ===");
        kasir.cetakNota(mobil);
        System.out.println("\n=== NOTA MOTOR ===");
        kasir.cetakNota(motor);
        System.out.println("\n=== INFORMASI GARASI ===");
        garasi.tampilInfo();
    }
}

