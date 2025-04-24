package Praktikum.sesi6.Tugas6;

// Membuat kelas bernama 'Piknik'
class Piknik {
    // Variabel untuk menyimpan atribut piknik
    String namaPaket;
    int harga;
    String lokasi;
    int durasi; // durasi piknik dalam jam

    // Konstruktor untuk kelas Piknik
    Piknik(String namaPaket, int harga, String lokasi, int durasi) {
        this.namaPaket = namaPaket;
        this.harga = harga;
        this.lokasi = lokasi;
        this.durasi = durasi;
    }

    // Method untuk menampilkan detail piknik
    void tampilkanDetail() {
        System.out.println("Nama Paket: " + namaPaket);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Durasi: " + durasi + " jam");
    }

    // Method untuk menghitung total biaya berdasarkan durasi
    int hitungTotalBiaya() {
        return harga * durasi;
    }

    // Method untuk mengubah lokasi piknik
    void ubahLokasi(String lokasiBaru) {
        lokasi = lokasiBaru;
        System.out.println("Lokasi piknik telah diubah menjadi: " + lokasiBaru);
    }
}

// Kelas utama untuk menjalankan program
public class ClassPiknik {
    public static void main(String[] args) {
        // Membuat objek dari kelas Piknik
        Piknik paket1 = new Piknik("Paket Hemat", 150000, "Pantai Kuta", 4);
        Piknik paket2 = new Piknik("Paket Lengkap", 300000, "Puncak Bogor", 6);

        // Menampilkan detail dari objek paket1 dan paket2
        System.out.println("Detail Paket 1:");
        paket1.tampilkanDetail();
        System.out.println("Total Biaya Paket 1: Rp " + paket1.hitungTotalBiaya());

        System.out.println("\nDetail Paket 2:");
        paket2.tampilkanDetail();
        System.out.println("Total Biaya Paket 2: Rp " + paket2.hitungTotalBiaya());

        // Mengubah lokasi paket1 dan menampilkan detailnya lagi
        System.out.println("\nMengubah lokasi Paket 1...");
        paket1.ubahLokasi("Gunung Bromo");

        System.out.println("\nDetail Paket 1 setelah perubahan lokasi:");
        paket1.tampilkanDetail();
    }
}
