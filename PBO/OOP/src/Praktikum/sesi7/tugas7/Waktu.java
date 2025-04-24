package Praktikum.sesi7.tugas7;

public class Waktu {
    private int menitWaktu; // Menyimpan jumlah menit sejak jam 00:00

    // Constructor untuk inisialisasi awal
    public Waktu (int menit) {
        this.menitWaktu = menit;
    }

    // Method untuk mendapatkan bagian jam dari menitWaktu
    public int getJam() {
        return menitWaktu / 60;
    }

    // Method untuk mendapatkan bagian menit dari menitWaktu
    public int getMenit() {
        return menitWaktu % 60;
    }

    // Method untuk menambahkan jam ke menitWaktu tanpa mempengaruhi bagian menitnya
    public void setJam(int j) {
        this.menitWaktu = (j * 60) + getMenit();
    }

    // Method untuk menambahkan menit ke menitWaktu tanpa mempengaruhi bagian jamnya
    public void setMenit(int m) {
        this.menitWaktu = (getJam() * 60) + m;
    }

    // Method untuk mendapatkan total menit
    public int getTotalMenit() {
        return menitWaktu;
    }

    // Method untuk menambahkan jam (dalam satuan jam) ke menitWaktu
    public void tambahJam(int j) {
        this.menitWaktu += j * 60;
    }

    // Method untuk menambahkan menit ke menitWaktu
    public void tambahMenit(int m) {
        this.menitWaktu += m;
    }

    // Method untuk menambahkan jam dan menit ke menitWaktu
    public void tambahWaktu(int j, int m) {
        this.menitWaktu += (j * 60) + m;
    }

    // Method untuk menampilkan waktu dalam format jam:menit
    public void tampilWaktu() {
        System.out.printf("Waktu: %02d:%02d\n", getJam(), getMenit());
    }
}
