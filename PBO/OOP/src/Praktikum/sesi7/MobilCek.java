package Praktikum.sesi7;

public class MobilCek {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);

        //mengakses atribut public
        System.out.println("Merk Mobil: " + mobil1.merk); //Output: toyota
        
        //Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi); // output: 2022

        //Mengakses atribut private menggunakan getter
        System.out.println("Harga Mobil: " + mobil1.getHarga()); // output: 300000000

        //Mengubah nilai atribut private menggunakan setter
        mobil1.setHarga(350000000);
        System.out.println("Harga Mobil setelah siubah: " + mobil1.getHarga()); //output: 350000000

        //menampilkan informasi lengkap mobil
        mobil1.tampilkanInfoMobil();

    }

}
