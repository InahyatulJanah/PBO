package Praktikum.sesi10.LatihanAbstrak;

public class StaffTester {
    public static void main(String[] args) {
        Staff s = new Staff("Januar", "1234", "Keuangan");
        s.kirimEmail("a@test.com", "Info Test", "Isi email");
        System.out.println("NIP: " + s.getNIP() + "\n" +
                           "Nama: " + s.getNama() + "\n" +
                           "Bagian: " + s.getBagian() + "\n" +
                           "Gaji: " + s.hitungGaji());
    }

}
