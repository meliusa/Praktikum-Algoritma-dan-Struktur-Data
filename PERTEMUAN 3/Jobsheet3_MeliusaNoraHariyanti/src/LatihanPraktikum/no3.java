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
public class no3 {

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("    MENGHITUNG LUAS TANAH");
        System.out.println("==============================");

        int jml;

        Scanner asd = new Scanner(System.in);

        System.out.println("");
        System.out.print("Jumlah tanah >> ");
        jml = asd.nextInt();

        LuasTanah[] ltArray = new LuasTanah[jml];

        Scanner asd1 = new Scanner(System.in);

        System.out.println("");
        for (int i = 0; i < jml; i++) {
            ltArray[i] = new LuasTanah();
            System.out.print("Masukkan panjang tanah ke-" + (i + 1) + " : ");
            ltArray[i].panjang = asd1.nextDouble();
            System.out.print("Masukkan lebar tanah ke-" + (i + 1) + " : ");
            ltArray[i].lebar = asd1.nextDouble();
            System.out.println("");
        }

        System.out.println("------------------------------");
        System.out.println("");

        for (int i = 0; i < jml; i++) {
            System.out.println("Luas tanah ke-" + (i + 1) + " adalah " + ltArray[i].luasTanah());
        }

        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");

        double tanah_terluas = 0;
        int count = 1;

        for (int i = 0; i < jml; i++) {
            tanah_terluas = ltArray[0].tanahTerluas((i+1), ltArray[i].luasTanah());
            count = ltArray[0].count;
        }

        System.out.println("Tanah terluas adalah tanah ke-" + count + " (" + tanah_terluas + ")");

    }
}
