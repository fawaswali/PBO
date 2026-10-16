package latihan;

public class Main {
    public static void main(String[] args) {

        Anggota agt = new Anggota("21", "FAWAS");
        KartuMember krtmber = new KartuMember("KM-001", 10.0, agt);
        krtmber.info();

    }
}
