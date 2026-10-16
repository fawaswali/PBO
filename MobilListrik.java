public class MobilListrik extends Kendaraan {
    private int kapasitasBaterai; // dalam kWh
    private boolean statusPengisian;

    public void setKapasitasBaterai(int kapasitas) {
        this.kapasitasBaterai = kapasitas;
    }

    public void isiBaterai() {
        this.statusPengisian = true;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi(); // Memanggil cetakInformasi milik Kendaraan
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " kWh");
        System.out.println("Status Pengisian Daya: " + (statusPengisian ? "Sedang Mengisi" : "Tidak Mengisi"));
    }
}
