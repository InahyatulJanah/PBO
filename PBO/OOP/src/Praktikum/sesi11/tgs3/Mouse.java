package Praktikum.sesi11.tgs3;

public interface Mouse {
    String jenis = "Laser Mouse";
    // Method Interface harus public
    public void klik_kanan();
    public void klik_kiri();
    // Tidak boleh ada method normal/biasa
    // yang terdapat isi method-nya
}