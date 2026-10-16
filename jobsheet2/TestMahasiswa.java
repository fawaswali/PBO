package jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim="101";
        mhs1.nama="Lestari";
        mhs1.alamat="Jl.Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim="254107020037";
        mhs2.nama="Fawas";
        mhs2.alamat="Jl.Pisang Kipas No 3";
        mhs2.kelas="1D";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim="123456789011";
        mhs3.nama="Doni";
        mhs3.alamat="Jl.Magnolia No 3C";
        mhs3.kelas="3E";
        mhs3.tampilBiodata();


    }
}
