package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir najmi = new NilaiAkhir("MUHAMMAD NAJMI ANWAR","2110010433",85,80,90);
        System.out.println("nama \t        : "+ najmi.getNama());
        System.out.println("npm \t         : "+ najmi.getNpm());
        System.out.println("nilai akhir \t : "+ najmi.hitungNilaiAkhir());
    }
}