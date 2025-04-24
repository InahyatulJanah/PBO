package Praktikum.sesi4.tugas4;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int angka;
        char pilihan;
        double hasil = 0;
        String operasiNama = "";

        // Menggunakan operator aritmatika
        System.out.println("Masukkan dua angka untuk operasi aritmatika:");
        System.out.print("Angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char operasi = scanner.next().charAt(0);

        // Penggunaan if untuk memilih operasi
        if (operasi == '+') {
            hasil = angka1 + angka2;
            operasiNama = "penjumlahan";
        } else if (operasi == '-') {
            hasil = angka1 - angka2;
            operasiNama = "pengurangan";
        } else if (operasi == '*') {
            hasil = angka1 * angka2;
            operasiNama = "perkalian";
        } else if (operasi == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                operasiNama = "pembagian";
            } else {
                System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Operasi tidak valid.");
        }

        // Menampilkan hasil operasi
        if (operasi == '+' || operasi == '-' || operasi == '*' || (operasi == '/' && angka2 != 0)) {
            System.out.println("Hasil operasi dari " + angka1 + " " + operasi + " " + angka2 + " = " + hasil);
        }

        char lanjut = 'y'; // variabel untuk melanjutkan menu
        while (lanjut == 'y' || lanjut == 'Y') {
            // Menggunakan switch untuk memilih menu
            System.out.println("\nPilih menu!");
            System.out.println("a. Perulangan dengan for");
            System.out.println("b. Perulangan dengan while");
            System.out.println("c. Perulangan dengan do-while");
            System.out.print("Masukkan pilihan menu: ");
            pilihan = scanner.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    // Penggunaan for loop
                    System.out.print("Masukkan angka untuk perulangan for: ");
                    angka = scanner.nextInt();
                    for (int i = 1; i <= angka; i++) {
                        System.out.println("For loop iterasi ke-" + i);
                    }
                    break;

                case 'b':
                    // Penggunaan while loop
                    System.out.print("Masukkan angka untuk perulangan while: ");
                    angka = scanner.nextInt();
                    int i = 1;
                    while (i <= angka) {
                        System.out.println("While loop iterasi ke-" + i);
                        i++;
                    }
                    break;

                case 'c':
                    // Penggunaan do-while loop
                    System.out.print("Masukkan angka untuk perulangan do-while: ");
                    angka = scanner.nextInt();
                    int j = 1;
                    do {
                        System.out.println("Do-while loop iterasi ke-" + j);
                        j++;
                    } while (j <= angka);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Meminta pengguna apakah ingin melanjutkan memilih menu perulangan
            System.out.print("\nApakah ingin lanjut memilih menu? y/t : ");
            lanjut = scanner.next().charAt(0);
        }

        System.out.println("Program selesai.");
        scanner.close();
            }
        }       