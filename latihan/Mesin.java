package latihan;

public class Mesin {
    private String tipe;
    private int cc;

    public Mesin (String tipe, int cc) {
        this.cc = cc;
        this.tipe = tipe;
    }

    public String getTipe () {
            return tipe;
    }

    public int getCc () {
        return cc;
    }

    public void Info () {
        System.out.println("tipe : " + tipe);
        System.out.println("Cc : " + cc);
    }
}
