package Praktikum.sesi5;

public class Ulang {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        // Perulangan untuk memeriksa bilangan genap antara 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Memeriksa apakah bilangan tersebut genap
                System.out.println(i); // Menampilkan bilangan genap
                jumlahGenap++; // Menambah jumlah bilangan genap
            }
        }

        // Menampilkan total jumlah bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100: " + jumlahGenap);
    }
}
