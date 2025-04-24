package Praktikum.sesi7;

public class SiswaTester {
    public static void main(String[] args) {
        //membuat objek siswa
            Siswa siswa1 = new Siswa("Andi", 85);
            siswa1.tampilkanInfo();

            // Menggunakan Setter untuk mengubah nama dan nilai ujian
            siswa1.setNama("Budi");
            siswa1.setNilaiUjian(95);

            //Menampilkan informasi yang telah diperbarui
            System.out.println("\nSetelah Diubah: ");
            siswa1.tampilkanInfo();

            //Menguji validasi dengan memasukkan nilai yang tidak valid
            siswa1.setNilaiUjian(105); //output: Nilai harus antara 0 dan 100
    }
}
