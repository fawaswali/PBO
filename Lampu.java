public class Lampu {
    private String warna;
    private int dayaWatt;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setDayaWatt(int dayaWatt) {
        this.dayaWatt = dayaWatt;
    }

    public void cetakInformasi() {
        System.out.println("Warna Lampu: " + warna);
        System.out.println("Daya: " + dayaWatt + " Watt");
    }
}
