package Praktikum.sesi9.Pegawai;

public class Main {
    public static void main(String[] args) {
        //Membuat sebuah object
        //"Pegawai" merupakan class, lalu "pegawai" merupakan objek yang akan dibuat, lalu "new pegawai();" merupakan construktor.
        Pegawai Pegawai = new Pegawai();
        Manager Manager = new Manager();
        Kasir Kasir = new Kasir();
        Koki Koki = new Koki();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();

        //Memasukkan nilai variabel menggunakan objek
        Manager.nama = "sifa";
        Manager.id_pegawai = 1;
        Manager.gaji = "7 juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "1,2 juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2 juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,2 juta";

        Satpam.nama = "Aldi";
        Satpam.id_pegawai = 5 ;
        Satpam.gaji = "1 juta";
        //nilai tersebut akan dimasukkan kedalam variabel yang ada pada superclass.
        //Memanggil fungsi pada superclass

        Pegawai.menampilkan();
        //memanggil nilai variabel pada superclass dan memasukkan nya kedalam fungsi yang ada pada class;
        Manager.menampilkan();
        Manager.tugas();
       
        Kasir.menampilkan();
        Kasir.tugas();

        Koki.menampilkan();
        Koki.tugas();

        Pelayan.menampilkan();
        Pelayan.tugas();

        Satpam.menampilkan();
        Satpam.tugas();
    }
}
