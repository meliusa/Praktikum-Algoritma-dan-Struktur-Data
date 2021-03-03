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

public class no3_array {

    public static void main(String[] args) {

        int[][] royalgarden = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        String menu, jenis_bunga;
        int jml_bunga = 0, total_pendapatan = 0;

        Scanner asd = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("             ROYAL GARDEN");
        System.out.println("=====================================");

        System.out.println("");
        System.out.println("RoyalGarden1");
        System.out.println("Aglonema: " + royalgarden[0][0]);
        System.out.println("Keladi\t: " + royalgarden[0][1]);
        System.out.println("Alocasia: " + royalgarden[0][2]);
        System.out.println("Mawar\t: " + royalgarden[0][3]);

        System.out.println("");
        System.out.println("RoyalGarden2");
        System.out.println("Aglonema: " + royalgarden[1][0]);
        System.out.println("Keladi\t: " + royalgarden[1][1]);
        System.out.println("Alocasia: " + royalgarden[1][2]);
        System.out.println("Mawar\t: " + royalgarden[1][3]);

        System.out.println("");
        System.out.println("RoyalGarden3");
        System.out.println("Aglonema: " + royalgarden[2][0]);
        System.out.println("Keladi\t: " + royalgarden[2][1]);
        System.out.println("Alocasia: " + royalgarden[2][2]);
        System.out.println("Mawar\t: " + royalgarden[2][3]);

        System.out.println("");
        System.out.println("RoyalGarden4");
        System.out.println("Aglonema: " + royalgarden[3][0]);
        System.out.println("Keladi\t: " + royalgarden[3][1]);
        System.out.println("Alocasia: " + royalgarden[3][2]);
        System.out.println("Mawar\t: " + royalgarden[3][3]);

        System.out.println("A. Jumlah stock berdasarkan jenis bunga di seluruh cabang");
        System.out.println("B. Pengurangan stock dikarenakan bunga mati di RoyalGarden1");

        System.out.println("");
        System.out.print("Masukkan menu A/B : ");
        menu = asd.nextLine();

        if (menu.equalsIgnoreCase("A")) {
            System.out.println("-------------------------------------");
            System.out.println("          Jenis-jenis bunga");
            System.out.println("-------------------------------------");
            System.out.println("o> Aglonema");
            System.out.println("o> Keladi");
            System.out.println("o> Alocasia");
            System.out.println("o> Mawar");

            Scanner asd1 = new Scanner(System.in);

            System.out.println("");
            System.out.print("Masukkan jenis bunga : ");
            jenis_bunga = asd1.nextLine();

            if (jenis_bunga.equalsIgnoreCase("Aglonema")) {
                for (int i = 0; i < royalgarden.length; i++) {
                    jml_bunga += royalgarden[i][0];
                }
            } else if (jenis_bunga.equalsIgnoreCase("Keladi")) {
                for (int i = 0; i < royalgarden.length; i++) {
                    jml_bunga += royalgarden[i][1];
                }
            } else if (jenis_bunga.equalsIgnoreCase("Alocasia")) {
                for (int i = 0; i < royalgarden.length; i++) {
                    jml_bunga += royalgarden[i][2];
                }
            } else if (jenis_bunga.equalsIgnoreCase("mawar")) {
                for (int i = 0; i < royalgarden.length; i++) {
                    jml_bunga += royalgarden[i][3];
                }
            }

            System.out.println("-------------------------------------");
            System.out.println("Jumlah '" + jenis_bunga + "' di seluruh cabang adalah " + jml_bunga);

        } else if (menu.equalsIgnoreCase("B")) {
            System.out.println("-------------------------------------");
            System.out.println(" Rincian Bunga Mati di RoyalGarden1");
            System.out.println("-------------------------------------");
            System.out.println("o> Aglonema\t: 1");
            royalgarden[0][0] -= 1;
            System.out.println("o> Keladi\t: 2");
            royalgarden[0][1] -= 2;
            System.out.println("o> Alocasia\t: 0");
            System.out.println("o> Mawar\t: 5");
            royalgarden[0][3] -= 5;
            System.out.println("-------------------------------------");
            System.out.println("Total pendapatan RoyalGarden sekarang");
            System.out.println("-------------------------------------");
            System.out.println("o> Aglonema\t: " + royalgarden[0][0] + " x75000");
            System.out.println("o> Keladi\t: " + royalgarden[0][1] + " x50000");
            System.out.println("o> Alocasia\t: " + royalgarden[0][2] + " x60000");
            System.out.println("o> Mawar\t: " + royalgarden[0][3] + " x10000");
            System.out.println("_____________________________________+");
            total_pendapatan = (royalgarden[0][0] * 75000) + (royalgarden[0][1] * 50000) + (royalgarden[0][2] * 60000) + (royalgarden[0][3] * 10000);
            System.out.println("o> Total\t: " + total_pendapatan);
        } else {
            System.out.println("-------------------------------------");
            System.out.println("Maaf, menu yang Anda pilih tidak ada.");
        }
    }
}
