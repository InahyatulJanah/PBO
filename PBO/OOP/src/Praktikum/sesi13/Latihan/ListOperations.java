package Praktikum.sesi13.Latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Menambahkan data ke dalam list
        list.add("Apel");
        list.add("Pisang");
        list.add("Ceri");
        list.add("Kurma");
        list.add("Sawo");

        // Tampilkan data pada list
        System.out.println("Daftar Asli: " + list);

        // Balik data pada list dan tampilkan
        List<String> daftarTerbalik = new ArrayList<>(list);
        Collections.reverse(daftarTerbalik);
        System.out.println("Daftar Terbalik: " + daftarTerbalik);

        // Acak data pada list dan tampilkan
        List<String> daftarAcak = new ArrayList<>(list);
        Collections.shuffle(daftarAcak);
        System.out.println("Daftar Acak: " + daftarAcak);

        // Urutkan data pada list dan tampilkan
        List<String> daftarUrut = new ArrayList<>(list);
        Collections.sort(daftarUrut);
        System.out.println("Daftar Urut: " + daftarUrut);
    }
}
