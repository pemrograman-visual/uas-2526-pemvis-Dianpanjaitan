// 12S25020 Julia Simatupang
// 12S25057 Dian Panjaitan
import java.util.*;
import java.lang.Math;

public class soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaBarang;
        int stokAwal, jumlahTerjual, stokAkhir;

        System.out.println("Masukkan NamaBarang");
        namaBarang = input.nextLine();
        System.out.println("Masukkan StokAwal");
        stokAwal = Integer.parseInt(input.nextLine());
        System.out.println("JumlahTerjual");
        jumlahTerjual = Integer.parseInt(input.nextLine());
        stokAkhir = stokAwal - jumlahTerjual;
        System.out.println("Nama Barang:" + namaBarang);
        System.out.println("StokAwal:" + stokAwal);
        System.out.println("Terjual:" + jumlahTerjual);
        System.out.println("StokAkhir:" + stokAkhir);
        if (stokAkhir < 0) {
            System.out.println("Habis, segera stok");
        } else {
            if (stokAkhir < 5) {
                System.out.println("Stok Menipis");
            } else {
                if (stokAkhir > 5) {
                    System.out.println("Stok Aman");
                }
            }
        }
    }
}
