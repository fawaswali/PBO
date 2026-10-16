package Teori_4;

public class SPBU {
    private String NamaSPBU;

    public SPBU(String namaSPBU) {
        this.NamaSPBU = namaSPBU;
    }

    public String getNamaSPBU() {
        return NamaSPBU;
    }

    public void setNamaSPBU(String namaSPBU) {
        this.NamaSPBU = namaSPBU;
    }

    public void isiBahanBakar(String merekMotor, double liter) {
        System.out.println("Mengisi " + liter + " liter bensin untuk " + merekMotor + " di " + NamaSPBU);
    }
}
