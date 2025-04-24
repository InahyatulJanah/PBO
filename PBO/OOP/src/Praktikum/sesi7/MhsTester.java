package Praktikum.sesi7;

public class MhsTester {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21, "Teknik Informatika");

        // Mengakses atribut public
        System.out.println("Nama Mahasiswa: " + mahasiswa1.nama); //Output: Andi 

        //Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Usia Mahasiswa: " + mahasiswa1.usia); //output: 21

        //Mengakses atribut private menggunakan getter
        System.out.println("Jurusan Mahasiswa: " + mahasiswa1.getJurusan()); // Output: Teknik Informatika

        //Mengubah nilai atribut private menggunakan setter
        mahasiswa1.setJurusan("Sistem Informasi");
        System.out.println("jurusan mahasiswa setelah diubah: " + mahasiswa1.getJurusan()); //Output: sistem Informasi

        //Menampilkan informasi lengkap mahasiswa
        mahasiswa1.tampilkaninfo();
    }
}
