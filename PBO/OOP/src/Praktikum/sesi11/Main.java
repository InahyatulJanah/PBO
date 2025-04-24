package Praktikum.sesi11;

// Kelas abstrak: Hewan
abstract class Hewan {
    protected String nama;
    protected int usia;

    // Konstruktor
    public Hewan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Metode abstrak
    public abstract void bersuara();

    // Metode konkret
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }
}

// Interface: Pemeliharaan
interface Pemeliharaan {
    void memberiMakan();  // Memberi makan hewan
    void merawat();       // Merawat hewan
}

// Kelas konkret: Kucing
class Kucing extends Hewan implements Pemeliharaan {
    private String warna;

    // Konstruktor
    public Kucing(String nama, int usia, String warna) {
        super(nama, usia);
        this.warna = warna;
    }

    // Implementasi metode abstrak dari Hewan
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    // Implementasi metode dari interface Pemeliharaan
    @Override
    public void memberiMakan() {
        System.out.println(nama + " diberi makan.");
    }

    @Override
    public void merawat() {
        System.out.println(nama + " sedang dirawat.");
    }

    // Metode untuk menampilkan semua informasi
    public void tampilkanSemuaInfo() {
        tampilkanInfo();
        System.out.println("Warna: " + warna);
        memberiMakan();
        merawat();
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Tommy", 3, "Hitam");

        // Memanggil metode yang tersedia
        kucing.tampilkanSemuaInfo();
        kucing.bersuara();
    }
}
