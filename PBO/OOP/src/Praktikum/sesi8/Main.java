package Praktikum.sesi8;

public class Main {
    public static void main(String[] args) {
        //Membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //Membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        //Membuat objek lingkaran dan mengisi nilai properti 
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        //Membuat objek persegi panjang dan mengisi nilai properti 
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        //Membuat objek segitiga dan mengisi nilai properti 
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;

        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
