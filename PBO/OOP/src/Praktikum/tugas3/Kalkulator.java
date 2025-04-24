package Praktikum.tugas3;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            System.out.print("Operasi (tambah, kurang, bagi, kali): ");
            String operasi = scanner.next().toLowerCase();

            double hasil = 0;
            switch (operasi) {
                case "tambah":
                    hasil = angka1 + angka2;
                    System.out.println("Hasil dari " + angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case "kurang":
                    hasil = angka1 - angka2;
                    System.out.println("Hasil dari " + angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case "kali":
                    hasil = angka1 * angka2;
                    System.out.println("Hasil dari " + angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case "bagi":
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil dari " + angka1 + " / " + angka2 + " = " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Operasi tidak dikenali.");
                    break;
                }
                System.out.println();

                System.out.print("Apakah ingin coba lagi? (y/tidak): ");
                ulang = scanner.next().toLowerCase();
                
            } while (ulang.equals("y"));
    
            scanner.close();
            System.out.println("Terima kasih sudah menggunakan kalkulator dalam perhitungan anda.");    
        
    }
}
