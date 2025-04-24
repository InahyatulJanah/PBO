package Praktikum.sesi10.Latihan_PolymorfismeDinamis;

public class Lingkaran extends Bentuk{
    protected void gambar () {
        System.out.println("subclass -> Menggambar Lingkaran");
    }

    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Lingkaran");
    }   
}
