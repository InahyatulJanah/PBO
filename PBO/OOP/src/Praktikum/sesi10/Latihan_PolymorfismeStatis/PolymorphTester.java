package Praktikum.sesi10.Latihan_PolymorfismeStatis;

public class PolymorphTester {
    public static void main(String[] args){
        Polymorph p=new Polymorph();
        System.out.println("2 + 3 = "+p.tambah(2, 3));
        System.out.println("\"2\" + \"3\" = "+p.tambah("2", "3"));
    }
}
