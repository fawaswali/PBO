package jobsheet4.tugas;

public class Main {
    public static void main(String[] args) {
        // 1. Buat objek Pelanggan (Aggregation: dibuat mandiri di luar Nota)
        Pelanggan pelanggan1 = new Pelanggan("Ahmad Fauzi");

        // 2. Buat objek Nota
        // - Pelanggan dihubungkan via agregasi
        // - Item ("RAM DDR4 16GB", 650000) dibuat langsung di dalam constructor Nota (Composition)
        Nota notaTransaksi = new Nota("INV-2026-001", pelanggan1, "RAM DDR4 16GB", 650000);

        // 3. Buat objek Kasir
        Kasir kasir1 = new Kasir("KSR-01");

        // 4. Kasir memproses dan mencetak nota (Dependency: nota hanya lewat sebagai parameter method)
        kasir1.prosesTransaksi(notaTransaksi);
    }
}
