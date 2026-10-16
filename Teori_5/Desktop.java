package Teori_5;

public class Desktop extends Komputer {
    protected String Printer;

    public Desktop(String merk, int memory, int cpu, String printer) {
        super(merk, memory, cpu);
        this.Printer = printer;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Printer         : " + Printer);
    }
}
