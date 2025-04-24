package Praktikum.sesi10.LatihanAbstrak;

public class Staff extends Pegawai {
    private String bagian;

    public Staff(String nama, String NIP, String bagian) {
        super(nama, NIP);
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    @Override
    public double hitungGaji() {
        // Implementasi perhitungan gaji untuk Staff
        return 5000000; // Contoh gaji tetap
    }
}