/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

import java.util.Scanner;

/**
 *
 * @author Meliusa
 */
public class no1 {

    public static void main(String[] args) {

        int pilih, jml;

        Scanner asd = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("    VOLUME DAN LUAS PERMUKAAN");
        System.out.println("===================================");
        System.out.println("1. Bola");
        System.out.println("2. Kubus");
        System.out.println("3. Kerucut");

        System.out.println("");
        System.out.print("Pilih >> ");
        pilih = asd.nextInt();

        System.out.print("Jumlah bangun >> ");
        jml = asd.nextInt();

        Scanner asd1 = new Scanner(System.in);

        switch (pilih) {
            case 1:
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("               BOLA");
                System.out.println("-----------------------------------");

                Bola[] bArray = new Bola[jml];

                for (int i = 0; i < jml; i++) {
                    bArray[i] = new Bola();
                    System.out.print("Masukkan jari jari bangun ke-" + (i + 1) + " : ");
                    bArray[i].jarijari = asd1.nextDouble();
                }

                System.out.println("-----------------------------------");
                for (int i = 0; i < jml; i++) { //luas permukaan
                    System.out.println("Luas permukaan bangun ke-" + (i + 1) + " " + bArray[i].luasPermukaan());
                }
                System.out.println("");
                for (int i = 0; i < jml; i++) { //volume
                    System.out.println("Volume bangun ke-" + (i + 1) + " " + bArray[i].volume());
                }
                break;
            case 2:
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("              KUBUS");
                System.out.println("-----------------------------------");

                Kubus[] kArray = new Kubus[jml];

                for (int i = 0; i < jml; i++) {
                    kArray[i] = new Kubus();
                    System.out.print("Masukkan sisi bangun ke-" + (i + 1) + " : ");
                    kArray[i].sisi = asd1.nextDouble();
                }

                System.out.println("-----------------------------------");
                for (int i = 0; i < jml; i++) { //luas permukaan
                    System.out.println("Luas permukaan bangun ke-" + (i + 1) + " " + kArray[i].luasPermukaan());
                }
                System.out.println("");
                for (int i = 0; i < jml; i++) { //volume
                    System.out.println("Volume bangun ke-" + (i + 1) + " " + kArray[i].volume());
                }
                break;
            case 3:
                System.out.println("");
                System.out.println("-----------------------------------");
                System.out.println("              KERUCUT");
                System.out.println("-----------------------------------");

                Kerucut[] keArray = new Kerucut[jml];

                for (int i = 0; i < jml; i++) {
                    keArray[i] = new Kerucut();
                    System.out.print("Masukkan jari-jari bangun ke-" + (i + 1) + " : ");
                    keArray[i].jarijari = asd1.nextDouble();
                    System.out.print("Masukkan tinggi bangun ke-" + (i + 1) + " : ");
                    keArray[i].tinggi = asd1.nextDouble();
                    System.out.print("Masukkan apotema bangun ke-" + (i + 1) + " : ");
                    keArray[i].apotema = asd1.nextDouble();
                }

                System.out.println("-----------------------------------");
                for (int i = 0; i < jml; i++) { //luas permukaan
                    System.out.println("Luas permukaan bangun ke-" + (i + 1) + " " + keArray[i].luasPermukaan());
                }
                System.out.println("");
                for (int i = 0; i < jml; i++) { //volume
                    System.out.println("Volume bangun ke-" + (i + 1) + " " + keArray[i].volume());
                }
                break;
            default:
                System.out.println("-----------------------------------");
                System.out.println("Maaf, pilihan Anda tidak ada.");
        }
    }
}
