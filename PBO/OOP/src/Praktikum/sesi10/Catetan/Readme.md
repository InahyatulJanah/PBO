1. Overloading (Statis)
Overloading bersifat statis atau compile-time polymorphism.

## Definisi:
Overloading terjadi ketika dua atau lebih metode dalam kelas yang sama memiliki nama yang sama, tetapi berbeda dalam:
    - Jumlah parameter
    - Tipe parameter
    - Urutan parameter
Ciri khas utama: Penentuan metode mana yang akan dipanggil dilakukan saat compile-time (sebelum program berjalan).

## CONTOH OVERLOADING

class Kalkulator {
    // Metode overload dengan parameter berbeda
    void tambah(int a, int b) {
        System.out.println("Penjumlahan int: " + (a + b));
    }
    
    void tambah(double a, double b) {
        System.out.println("Penjumlahan double: " + (a + b));
    }
    
    void tambah(int a, int b, int c) {
        System.out.println("Penjumlahan 3 int: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.tambah(5, 3);               // Penjumlahan int
        k.tambah(5.5, 3.5);           // Penjumlahan double
        k.tambah(1, 2, 3);            // Penjumlahan 3 int
    }
}

## Penjelasan:
--> Semua metode tambah memiliki nama yang sama, tetapi parameter berbeda.
--> Metode mana yang akan dipanggil ditentukan oleh compiler pada compile-time berdasarkan parameter yang diberikan.
--> Inilah mengapa overloading disebut statis atau compile-time polymorphism.

2. Overriding (Dinamis)
Overriding bersifat dinamis atau runtime polymorphism.

## Definisi:
Overriding terjadi ketika kelas anak (subclass) mendefinisikan ulang metode yang ada di kelas induk (superclass) dengan:
    - Nama metode yang sama
    - Parameter yang sama
    - Return type yang sama (atau covariant).
Ciri khas utama: Metode mana yang akan dipanggil ditentukan saat runtime (ketika program berjalan) berdasarkan objek aktual.

## CONTOH OVERRIDING

class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.suara();  // Output: Meong
        hewan2.suara();  // Output: Guk guk
    }
}

## Penjelasan:
--> Kelas Kucing dan Anjing meng-override metode suara() milik kelas Hewan.
--> Variabel referensi Hewan (hewan1 dan hewan2) mengacu pada objek subclass (Kucing dan Anjing).
--> Metode mana yang dipanggil ditentukan pada runtime berdasarkan tipe objek aktual.
--> Inilah mengapa overriding disebut dinamis atau runtime polymorphism.

## Kesimpulan:
- Overloading adalah statis karena keputusan metode mana yang dipanggil ditentukan pada compile-time.
- Overriding adalah dinamis karena keputusan metode mana yang dipanggil ditentukan pada runtime berdasarkan tipe objek aktual.

Jika dalam program Anda ada metode dengan nama yang sama tetapi dengan implementasi berbeda, periksa:
- Jika parameter berbeda: itu adalah overloading (statis).
- Jika terjadi di subclass dan parameter sama: itu adalah overriding (dinamis).