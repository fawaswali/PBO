package jobsheet07;

// Superclass
class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernafas untuk hidup.");
    }

    public void makan() {
        System.out.println("Manusia makan makanan umum.");
    }
}

// Subclass Dosen
class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin kampus.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas.");
    }
}

// Subclass Mahasiswa
class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan makanan kosan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar.");
    }
}

// Class Main untuk pengujian Dynamic Method Dispatch
public class MainManusia {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        System.out.println("=== Perilaku Manusia ===");
        m1.bernafas();
        m1.makan();

        System.out.println("\n=== Perilaku Dosen ===");
        m2.bernafas(); // Memanggil method milik superclass
        m2.makan();    // Memanggil method overriding milik Dosen

        System.out.println("\n=== Perilaku Mahasiswa ===");
        m3.bernafas(); // Memanggil method milik superclass
        m3.makan();    // Memanggil method overriding milik Mahasiswa
    }
}