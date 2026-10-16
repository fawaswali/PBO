package Teori_5;

public class Komputer {
    protected String merk;
    protected int kapasitasMemory;
    protected int kecepatanCpu;

    public Komputer (String merk, int memory, int cpu) {
        this.merk = merk;
        this.kapasitasMemory = memory;
        this.kecepatanCpu = cpu;
    }
    public void showInfo() {
            System.out.println("Merk            : " + merk);
            System.out.println("Kapasitas Memory: " + kapasitasMemory+ " GB");
            System.out.println("Kecepatan CPU   : " + kecepatanCpu + " GHz");
    }
    

    public void nyalakanKomputer() {
        System.out.println("Komputer" + merk + "dinyalakan.");
    }
    
}
