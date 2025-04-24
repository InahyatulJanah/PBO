package Praktikum.sesi5;
import java.util.Scanner;
public class Genap {
    public static void main(String[] args) {
        // Membuat objek scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        int angka;

        // Perulangan yang akan terus berjalan sampai pengguna memasukkan angka 0
        do {
            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = scanner.nextInt();

            // Menampilkan angka yang dimasukkan, kecuali jika angka adalah 0
            if (angka != 0) {
                System.out.println("Anda memasukkan: " + angka);
            }

        } while (angka != 0); // Kondisi untuk keluar dari perulangan jika angka adalah 0

        // Menutup scanner
        scanner.close();
        System.out.println("Program berhenti.");
    }
}
