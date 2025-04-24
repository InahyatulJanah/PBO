package Praktikum.sesi13.Tugas;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan elemen bertipe String
        ArrayList<String> fruits = new ArrayList<>();

        // Menambahkan elemen ke dalam ArrayList
        fruits.add("Apel");
        fruits.add("Pisang");
        fruits.add("Jeruk");

        // Menampilkan semua elemen dalam ArrayList
        System.out.println("Buah-buahan: " + fruits);

        // Menghapus elemen tertentu dari ArrayList
        fruits.remove("Pisang");
        System.out.println("Setelah menghapus Pisang: " + fruits);

        // Menampilkan elemen menggunakan loop for-each
        for (String fruit : fruits) {
            System.out.println("Buah: " + fruit);
        }
    }
}