package Praktikum.sesi6;

//Membuat Class dengan nama Bintang Film
class BintangFilm {
    //atributnya
    private String nama;
    private Boolean pria;

    // Konstruktor : fungsi yang dijalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    //Method tanpa return dengan parameter
    private void Isikan(String nama, Boolean pria){
        this.nama = nama; // this adalah objek sekarang
        this.pria = pria;
    }

    //Method dengan return tanpa parameter
    String perolehanNama() {
        return (nama);
    }

    //Memperoleh Jenis Kelamin dengan tanpa parameter
    String perolehanJenisKelamin(){
        if (pria)
            return ("Pria");
        else
            return ("Wanita");
    }
}
public class ClassBintangFilm {
    public static void main(String[] args) {
        //Buat dua objek BintangFilm siA dan siB
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        //Menampilkan objek siA dan siB
        System.out.println("siA => " +siA.perolehanNama() + ", " + siA. perolehanJenisKelamin());
        System.out.println("siB => " +siB.perolehanNama() + ", " + siB. perolehanJenisKelamin());
    }
}
