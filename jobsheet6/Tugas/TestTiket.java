package jobsheet6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        // Objek 1: Tiket Kereta (Dibuat dengan konstruktor tanpa parameter)
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.setHargaDasar(35000); 
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";
        tk.tampilKereta();

        // Objek 2: Tiket Pesawat Domestik (Dibuat dengan konstruktor berparameter)
        TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        td.tampilDomestik();

        // Objek 3: Tiket Pesawat Internasional (Dibuat dengan konstruktor berparameter)
        TiketInternasional ti = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        ti.tampilInternasional();
    }
}
