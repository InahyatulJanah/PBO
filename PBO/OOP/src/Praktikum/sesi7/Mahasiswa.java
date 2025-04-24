package Praktikum.sesi7;

public class Mahasiswa {
    public String nama;
    protected int usia;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, int usia, String jurusan){
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter untuk atribut private jurusan
    public String getJurusan(){
        return jurusan;
    }

    // Setter untuk atribut private jurusan
    public void setJurusan(String jurusanBaru){
        this.jurusan = jurusanBaru;
    }

    // Metode untuk menampilkan informasi
    public void tampilkaninfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jurusan: " + jurusan);
    }
}
