package Praktikum.sesi13.Tugas;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Menambahkan elemen ke dalam LinkedList
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");

        // Menambahkan elemen di posisi pertama dan terakhir
        animals.addFirst("Lion");
        animals.addLast("Tiger");

        // Menampilkan semua elemen dalam LinkedList
        System.out.println("Animals: " + animals);

        // Menghapus elemen pertama dan terakhir dari LinkedList
        animals.removeFirst();
        animals.removeLast();

        // Menampilkan elemen setelah penghapusan
        System.out.println("After removing first and last elements: " + animals);
    }
}