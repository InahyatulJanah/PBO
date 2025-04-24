package Praktikum.sesi10.TugasPolymorfisme;

public class Main {
    // Kelas Induk: OperasiBilanganAbs
    abstract static class OperasiBilanganAbs {
        protected double a, b, c;
        protected abstract void set_A(double a);
        protected abstract void set_B(double b);
        protected abstract void set_C();
        protected abstract double get_A();
        protected abstract double get_B();
        protected abstract double get_C();
        protected abstract void tampil();
    }

    // Kelas OperasiPenjumlahan
    static class OperasiPenjumlahan extends OperasiBilanganAbs {
        @Override
        protected void set_A(double a) {
            this.a = a;
        }

        @Override
        protected void set_B(double b) {
            this.b = b;
        }

        @Override
        protected void set_C() {
            c = a + b;
        }

        @Override
        protected double get_A() {
            return a;
        }

        @Override
        protected double get_B() {
            return b;
        }

        @Override
        protected double get_C() {
            return c;
        }

        @Override
        protected void tampil() {
            set_C();
            System.out.println("Hasil Penjumlahan: " + get_C());
        }
    }

    // Kelas OperasiPengurangan
    static class OperasiPengurangan extends OperasiBilanganAbs {
        @Override
        protected void set_A(double a) {
            this.a = a;
        }

        @Override
        protected void set_B(double b) {
            this.b = b;
        }

        @Override
        protected void set_C() {
            c = a - b;
        }

        @Override
        protected double get_A() {
            return a;
        }

        @Override
        protected double get_B() {
            return b;
        }

        @Override
        protected double get_C() {
            return c;
        }

        @Override
        protected void tampil() {
            set_C();
            System.out.println("Hasil Pengurangan: " + get_C());
        }
    }

    // Kelas OperasiPerkalian
    static class OperasiPerkalian extends OperasiBilanganAbs {
        @Override
        protected void set_A(double a) {
            this.a = a;
        }

        @Override
        protected void set_B(double b) {
            this.b = b;
        }

        @Override
        protected void set_C() {
            c = a * b;
        }

        @Override
        protected double get_A() {
            return a;
        }

        @Override
        protected double get_B() {
            return b;
        }

        @Override
        protected double get_C() {
            return c;
        }

        @Override
        protected void tampil() {
            set_C();
            System.out.println("Hasil Perkalian: " + get_C());
        }
    }

    // Kelas OperasiPembagian
    static class OperasiPembagian extends OperasiBilanganAbs {
        @Override
        protected void set_A(double a) {
            this.a = a;
        }

        @Override
        protected void set_B(double b) {
            this.b = b;
        }

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
        protected double get_A() {
            return a;
        }

        @Override
        protected double get_B() {
            return b;
        }

        @Override
        protected double get_C() {
            return c;
        }

        @Override
        protected void tampil() {
            set_C();
            System.out.println("Hasil Pembagian: " + get_C());
        }

    }

    // Kelas final untuk mencetak hasil operasi
    final static class OperasiBilanganAbsCetak {
        private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
            for (OperasiBilanganAbs operasi : OB) {
                operasi.set_A(a);
                operasi.set_B(b);
                operasi.tampil();
            }
        }

        public static void main(String[] args) {
            double A = 6.5;
            double B = 0.5;

            // Membuat objek untuk operasi penjumlahan, pengurangan, perkalian, pembagian
            OperasiBilanganAbs[] operasi = new OperasiBilanganAbs[4];
            operasi[0] = new OperasiPenjumlahan();
            operasi[1] = new OperasiPengurangan();
            operasi[2] = new OperasiPerkalian();
            operasi[3] = new OperasiPembagian();

            // Membuat objek dari kelas final untuk mencetak hasil
            OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
            cetak.cetakSemua(operasi, A, B);
        }
    }
}