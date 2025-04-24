package Praktikum.sesi7;

public class Mobil {
    public String merk;
    protected int tahunProduksi;
    private double harga;

    //costructor
    public Mobil(String merk, int tahunProduksi, double harga){
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    //Getter untuk atribut private harga
    public double getHarga(){
        return harga;
    }

    // Setter untuk atribut private harga
    public void setHarga(double hargaBaru){
        if (hargaBaru > 0){
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    public void tampilkanInfoMobil(){
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);

    }
}
