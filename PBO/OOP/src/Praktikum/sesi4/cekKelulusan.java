package Praktikum.sesi4;

import java.util.Scanner;
//Program IF dengan dua kondisi

public class cekKelulusan {
    public static void main(String[] args) {
        //membuat variabwl dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        // mengambil input
        System.out.print("nama : "); nama = scan.nextLine();
        System.out.print("nilai : "); nilai = scan.nextInt();
        //cek apakah dia lulus atau tidak
        if (nilai >= 70){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else{
            System.out.println("Maaf" + nama + ", Anda gagal");
        }
    }
    
}
