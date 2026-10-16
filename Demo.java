public class Demo {
    public static void main(String[] args) {
        // 1. Objek Kipas Angin
        System.out.println("=== 1. OBJEK KIPAS ANGIN ===");
        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Maspion");
        kipas.aturKecepatan(2);
        kipas.cetakInformasi();

        // 2. Objek Lampu
        System.out.println("\n=== 2. OBJEK LAMPU ===");
        Lampu lampu = new Lampu();
        lampu.setWarna("Putih / Cool Daylight");
        lampu.setDayaWatt(12);
        lampu.cetakInformasi();

        // 3. Objek Mobil (Inheritance dari Kendaraan)
        System.out.println("\n=== 3. OBJEK MOBIL ===");
        Mobil mobilBensin = new Mobil();
        mobilBensin.setMerk("Daihatsu Sigra");
        mobilBensin.tambahKecepatan(70);
        mobilBensin.setJumlahPintu(5);
        mobilBensin.setKapasitasPenumpang(7);
        mobilBensin.cetakInformasi();

        // 4. Objek Mobil Listrik (Inheritance dari Kendaraan)
        System.out.println("\n=== 4. OBJEK MOBIL LISTRIK ===");
        MobilListrik ev = new MobilListrik();
        ev.setMerk("Wuling Air EV");
        ev.tambahKecepatan(85);
        ev.setKapasitasBaterai(72);
        ev.isiBaterai();
        ev.cetakInformasi();
    }
}
