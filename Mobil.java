public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private int kapasitasPenumpang;

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void setKapasitasPenumpang(int kapasitas) {
        this.kapasitasPenumpang = kapasitas;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi(); // Memanggil cetakInformasi milik Kendaraan
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
    }
}