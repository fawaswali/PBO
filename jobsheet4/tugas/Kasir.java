package jobsheet4.tugas;

// 4. Kelas Kasir (Bagian Dependency)
public class Kasir {
    private String idKasir;

    public Kasir(String idKasir) {
        this.idKasir = idKasir;
    }

    // DEPENDENCY (uses-a): Nota hanya dilewatkan lewat parameter, tidak disimpan sebagai atribut
    public void prosesTransaksi(Nota nota) {
        System.out.println("Kasir [" + idKasir + "] memproses struk:");
        System.out.println(nota.getStruk());
    }
}
