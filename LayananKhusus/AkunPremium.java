package LayananKhusus;
import LayananUtama.AkunBank;

public class AkunPremium extends AkunBank {
     private String benefitKhusus;

    public AkunPremium(String nomorAkun, double tingkatBunga,String benefit) {
        super(nomorAkun, tingkatBunga);
        this.benefitKhusus = benefit;
    }

    public void berikanBonusBunga() {
        double bungaBonus = tingkatBunga + 1.5;

        sesuaikanBunga(bungaBonus);
        System.out.println("Benefit tambahan: " + benefitKhusus);
        

    }


}
