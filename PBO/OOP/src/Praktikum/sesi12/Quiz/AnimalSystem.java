package Praktikum.sesi12.Quiz;

// Interface Action
interface Action {
    void bergerak();
    void bersuara();
}

// Abstract Class Animal
abstract class Animal implements Action {
    protected String nama;
    protected int ukuran;
    protected String sifat;

    public Animal() {}

    public Animal(String nama, int ukuran, String sifat) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.sifat = sifat;
    }

    public final void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public final void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }

    // Abstract methods from Action
    @Override
    public abstract void bergerak();

    @Override
    public abstract void bersuara();
}

// Class Mamalia
class Mamalia extends Animal {
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {}

    public Mamalia(String nama) {
        this.nama = nama;
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan " + jumlahKaki + " kaki.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Mamalia tidak bersuara khusus.");
    }
}

// Class Aves
class Aves extends Animal {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves() {}

    public Aves(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void bergerak() {
        if (bisaTerbang) {
            System.out.println(nama + " terbang di udara.");
        } else {
            System.out.println(nama + " berjalan di tanah.");
        }
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit-cuit.");
    }
}

// Class Ayam
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam() {}

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Kokok-kokok.");
    }
}

// Class Merpati
class Merpati extends Aves {
    public Merpati() {}

    public Merpati(String nama, int ukuran) {
        super(nama, ukuran);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Gruuk-gruuk.");
    }
}

// Main Class
public class AnimalSystem {
    public static void main(String[] args) {
        // Objek Mamalia
        Mamalia kucing = new Mamalia("Kucing");
        kucing.setJumlahKaki(4);
        kucing.setBisaJalan(true);
        kucing.bergerak();
        kucing.bersuara();

        // Objek Ayam
        Ayam ayamKampung = new Ayam("Ayam Kampung", 5);
        ayamKampung.setBisaTerbang(false);
        ayamKampung.setJenisAyam("Petarung");
        ayamKampung.bergerak();
        ayamKampung.bersuara();

        // Objek Merpati
        Merpati merpatiPos = new Merpati("Merpati", 3);
        merpatiPos.setBisaTerbang(true);
        merpatiPos.bergerak();
        merpatiPos.bersuara();
    }
}

