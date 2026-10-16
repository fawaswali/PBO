package Teori_5;

public class Laptop extends Komputer {
    protected int ResolusiLayar;

    public Laptop(String merk, int memory, int cpu, int resolusi) {
        super(merk, memory, cpu);
        this.ResolusiLayar = resolusi;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Resolusi Layar  : " + ResolusiLayar + " inch");
    }
}
