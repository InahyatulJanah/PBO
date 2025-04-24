package Praktikum.sesi10.LatihanAbstrak;

public abstract class Pegawai {
    private String NIP;
    private String nama;

    public Pegawai(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void kirimEmail(String to, String subjek, String isi) {
        System.out.println(getNama() + " mengirim email ke: " + to + "\n" +
                           "Dengan Subjek: " + subjek + "\n" +
                           "Dengan Isi: " + isi);
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract double hitungGaji();
}