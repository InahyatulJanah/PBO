package Praktikum.sesi12.Quiz;

// Interface Transportasi
interface Transportasi {
    int idz = 0; // Atribut idz (konstanta, bersifat final)
    
    void tempil(); // Method abstrak tampil
    void setData(); // Method abstrak setData
    int getId(); // Method abstrak getId
}

// Super Class Gojek
class Gojek implements Transportasi {
    protected int harga; // Atribut harga
    protected int id;    // Atribut id
    
    public Gojek() {
        this.id = 0;
        this.harga = 0;
    }
    
    @Override
    public void tempil() { // Method tampil dari interface
        System.out.println("id Gojek: " + id);
        System.out.println("harga: " + harga);
    }
    
    @Override
    public void setData() { // Method setData dari interface
        this.id = 1; // Contoh data
        this.harga = 1000;
    }
    
    @Override
    public int getId() { // Method getId dari interface
        return id;
    }
}

// Sub Class Bayar (Inheritance dari Gojek)
class Bayar extends Gojek {
    private int jarak;     // Atribut jarak
    private int total;     // Atribut total
    private String nama;   // Atribut nama
    
    public Bayar() {
        super(); // Panggil constructor superclass
        this.jarak = 0;
        this.total = 0;
        this.nama = "";
    }
    
    // Method overloading bayar()
    public void bayar() {
        total = jarak * harga; // Menghitung total berdasarkan jarak dan harga
        System.out.println("Transaksi selesai oleh: " + nama);
        System.out.println("Total Bayar: " + total);
    }
    
    public void bayar(int id) {
        this.id = id; // Set ID untuk pembayaran
        System.out.println("Transaksi dengan ID: " + id);
    }
    
    @Override
    public void tempil() { // Override method tampil
        System.out.println("ID Bayar: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak);
        System.out.println("Harga: " + harga);
        System.out.println("Total: " + total);
    }
    
    @Override
    public void setData() { // Override method setData
        super.setData(); // Memanggil setData dari superclass
        this.jarak = 10; // Contoh data jarak
        this.nama = "Budi";
    }
    
    @Override
    public int getId() { // Override method getId
        return this.id;
    }
}

// Main Class
public class Main2 {
    public static void main(String[] args) {
        // Membuat objek Gojek
        Gojek gojek = new Gojek();
        gojek.setData();
        System.out.println("Data - Data Gojek:");
        gojek.tempil();
        
        // Membuat objek Bayar
        Bayar bayar = new Bayar();
        bayar.setData();
        System.out.println("Data Transaksi:");
        bayar.tempil();
        
        System.out.println("\nMelakukan Transaksi:");
        bayar.bayar();
        bayar.bayar(02311); // Overload method bayar dengan parameter id
    }
}