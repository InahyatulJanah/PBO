package Praktikum.sesi10.TugasPolymorfisme;

// Kelas Induk: OperasiBilangan
abstract class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        // Diimplementasikan di kelas turunan
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected abstract void tampil();
}

// Kelas OperasiPenjumlahan
class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a + b;
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Hasil Penjumlahan: " + get_C());
    }
}

// Kelas OperasiPengurangan
class OperasiPengurangan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a - b;
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Hasil Pengurangan: " + get_C());
    }
}

// Kelas OperasiPerkalian
class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a * b;
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Hasil Perkalian: " + get_C());
    }
}

// Kelas OperasiPembagian
class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            c = Double.NaN; // Hasil tidak valid
        }
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Hasil Pembagian: " + get_C());
    }
}

// Kelas OperasiBilanganCetak
class OperasiBilanganCetak {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        double A = 10.5;
        double B = 0.5;

        OperasiBilangan[] operasi = new OperasiBilangan[4];
        operasi[0] = new OperasiPenjumlahan();
        operasi[1] = new OperasiPengurangan();
        operasi[2] = new OperasiPerkalian();
        operasi[3] = new OperasiPembagian();

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(operasi, A, B);
    }
}
