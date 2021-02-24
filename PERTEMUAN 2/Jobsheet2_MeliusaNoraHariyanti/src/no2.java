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

public class no2 {

    public static void main(String[] args) {

        boolean running = true;
        String jawab;

        while (running) {

            Peminjaman a = new Peminjaman();

            Scanner asd = new Scanner(System.in);

            System.out.println("================================");
            System.out.println("  SISTEM INFORMASI PEMINJAMAN");
            System.out.println("================================");

            System.out.print("o> Id member\t>> ");
            a.id_member = asd.nextInt();

            System.out.print("o> Nama member\t>> ");
            a.nama_member = asd.next();

            System.out.print("o> Nama game\t>> ");
            a.nama_game = asd.next();

            System.out.print("o> Lama pinjam\t>> ");
            a.lama_pinjam = asd.nextInt();

            System.out.print("o> Harga sewa\t>> ");
            a.harga_sewa = asd.nextInt();

            a.tampil_data();

            //Kembalian
            Scanner asd1 = new Scanner(System.in);

            System.out.print("o> BAYAR\t: ");
            a.bayar = asd1.nextInt();

            a.tampil_kembali();

            //Mengulang...
            Scanner asd2 = new Scanner(System.in);

            System.out.println("--------------------------------");
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
                System.out.println("--------------------------------");
                System.out.println("Pilihan tidak ada.");
                running = false;
            }
            //end - mengulang...
        }
    }
}
