package jobsheet07;

public class Segitiga {
    private int sudut;

    // Method totalSudut dengan 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Method totalSudut dengan 2 parameter (Overloading)
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Method keliling dengan 3 parameter (int)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Method keliling dengan 2 parameter (int) mengembalikan double (Overloading)
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    // Class Main untuk pengujian
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();

        System.out.println("Total Sudut (1 sudut): " + sg.totalSudut(60));
        System.out.println("Total Sudut (2 sudut): " + sg.totalSudut(60, 40));
        System.out.println("Keliling (3 sisi)    : " + sg.keliling(3, 4, 5));
        System.out.println("Keliling (Sisi Miring): " + sg.keliling(3, 4));
    }
}
