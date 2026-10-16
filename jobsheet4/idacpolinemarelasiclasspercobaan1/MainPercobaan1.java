package jobsheet4.idacpolinemarelasiclasspercobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor pl= new Processor();
        pl.setMerk("Intel i5");
        pl.setCache(4);

        Processor p1= new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop ();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();

        Laptop l2 = new Laptop("Thinkpad",
                    new Processor("Intel i5", 3));
        l2.info();
    }
}
