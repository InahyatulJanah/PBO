package Praktikum.sesi13.Latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nrp='" + nrp + "', nama='" + nama + "'}";
    }

    @Override
    public int compareTo(Mahasiswa other) {
        return this.nama.compareTo(other.nama);
    }
}

public class ListMahasiswa {
    public static void main(String[] args) {
        List<Mahasiswa> list = new ArrayList<>();

        // Menambahkan data ke dalam list
        list.add(new Mahasiswa("001", "Naya"));
        list.add(new Mahasiswa("002", "Dini"));
        list.add(new Mahasiswa("003", "Athir"));
        list.add(new Mahasiswa("004", "Rafly"));
        list.add(new Mahasiswa("005", "Suneo"));

        // Tampilkan data pada list
        System.out.println("Daftar Asli: " + list);

        // Balik data pada list dan tampilkan
        List<Mahasiswa> daftarTerbalik = new ArrayList<>(list);
        Collections.reverse(daftarTerbalik);
        System.out.println("Daftar Terbalik: " + daftarTerbalik);

        // Acak data pada list dan tampilkan
        List<Mahasiswa> daftarAcak = new ArrayList<>(list);
        Collections.shuffle(daftarAcak);
        System.out.println("Daftar Acak: " + daftarAcak);

        // Urutkan data pada list dan tampilkan
        List<Mahasiswa> daftarUrut = new ArrayList<>(list);
        Collections.sort(daftarUrut);
        System.out.println("Daftar Urut: " + daftarUrut);
    }
}
