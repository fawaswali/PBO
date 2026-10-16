package jobsheet3;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // Input muatan baru
        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double tambah = fawas.nextDouble();
        kontainerAlfa.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input bongkar muatan
        System.out.print("\nMasukkan berat muatan yang ingin dibongkar (kg): ");
        double bongkar = fawas.nextDouble();
        kontainerAlfa.turunkanMuatan(bongkar);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        fawas.close();
    }
}
