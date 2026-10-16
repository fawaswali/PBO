package Teori_4;

public class Mesin {
    private int Kapasitas; // dalam cc
    private String TipeBahanBakar;

    public Mesin(int kapasitas, String tipeBahanBakar) {
        this.Kapasitas = kapasitas;
        this.TipeBahanBakar = tipeBahanBakar;
    }

    public int getKapasitas() {
        return Kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.Kapasitas = kapasitas;
    }

    public String getTipeBahanBakar() {
        return TipeBahanBakar;
    }

    public void setTipeBahanBakar(String tipeBahanBakar) {
        this.TipeBahanBakar = tipeBahanBakar;
    }

    public void tampilkanInfo() {
        System.out.println("Kapasitas Mesin : " + Kapasitas + " cc");
        System.out.println("Tipe Bahan Bakar: " + TipeBahanBakar);
    }
}
