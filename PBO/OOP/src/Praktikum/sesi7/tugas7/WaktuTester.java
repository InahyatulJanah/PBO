package Praktikum.sesi7.tugas7;

public class WaktuTester {
     public static void main(String[] args) {
        Waktu waktu = new Waktu(90); // Inisialisasi dengan 90 menit (1 jam 30 menit)
        waktu.tampilWaktu();

        waktu.setJam(2); // Set jam menjadi 2
        waktu.tampilWaktu();

        waktu.setMenit(45); // Set menit menjadi 45
        waktu.tampilWaktu();

        waktu.tambahJam(1); // Tambah 1 jam
        waktu.tampilWaktu();

        waktu.tambahMenit(20); // Tambah 20 menit
        waktu.tampilWaktu();

        waktu.tambahWaktu(1, 15); // Tambah 1 jam 15 menit
        waktu.tampilWaktu();

        System.out.println("Total Menit: " + waktu.getTotalMenit());
    }
}
