/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
import java.util.Scanner;

public class no3 {

    public static void main(String[] args) {

        boolean running = true;
        String jawab;

        try {
            while (running) {
                Barang b = new Barang();

                Scanner asd = new Scanner(System.in);

                System.out.println("=================================");
                System.out.println("        MINIMART MELIUSA");
                System.out.println("=================================");

                System.out.print("o> Nama barang\t: ");
                b.nama = asd.nextLine();
                System.out.print("o> Harga satuan\t: ");
                b.harga_satuan = asd.nextInt();
                System.out.print("o> Jumlah\t: ");
                b.jumlah = asd.nextInt();
                System.out.println("--------------------------------- x");
                System.out.println("o> Total\t: " + b.hitungHargaTotal(b.harga_satuan, b.jumlah));
                System.out.println("o> Diskon\t: " + b.hitungDiskon(b.hitungHargaTotal(b.harga_satuan, b.jumlah)));
                System.out.println("--------------------------------- -");
                int hargatotal = b.hitungHargaTotal(b.harga_satuan, b.jumlah);
                int diskon = b.hitungDiskon(b.hitungHargaTotal(b.harga_satuan, b.jumlah));
                System.out.println("o> Total bayar\t: " + b.hitungHargaBayar(hargatotal, diskon));

                //Mengulang...
                Scanner asd2 = new Scanner(System.in);

                System.out.println("---------------------------------");
                System.out.println("");
                System.out.print("Mengulang.. (y/t) >> ");
                jawab = asd2.nextLine();

                //start - mengulang...
                if (jawab.equalsIgnoreCase("y")) {
                    System.out.println("");
                } else if (jawab.equalsIgnoreCase("t")) {
                    running = false;
                    System.out.println("Program dihentikan! Terimakasih, sampai berjumla lagi~!");
                } else {
                    System.out.println("---------------------------------");
                    System.out.println("Pilihan tidak ada.");
                    running = false;
                }
                //end - mengulang...
            }
        } catch (Exception e) {
            System.out.println("---------------------------------");
            System.out.println("Maaf, inputan yang Anda masukkan salah.");
        }
    }
}
