package Praktikum.sesi12.Quiz;

// Class Dosen
class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String get_Nik() {
        return nik;
    }

    public String get_Nama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

// Class Rektor (Anak dari Dosen)
class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama); // Memanggil constructor parent (Dosen)
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view(); // Memanggil method dari parent (Dosen)
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

// Class Dekan (Anak dari Dosen)
class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama); // Memanggil constructor parent (Dosen)
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view(); // Memanggil method dari parent (Dosen)
        System.out.println("Fakultas: " + fakultas);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Rektor
        Rektor rektor = new Rektor("838", "Dini Febryana S.kom", 2024);
        System.out.println("Data Diri Rektor:");
        rektor.viewRektor();

        System.out.println("\n====================\n");

        // Membuat objek Dekan
        Dekan dekan = new Dekan("836", "Suryani S.M", "Ilmu Komputer");
        System.out.println("Data Diri Dekan:");
        dekan.viewDekan();
    }
}