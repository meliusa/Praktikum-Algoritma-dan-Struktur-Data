/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Meliusa
 */
import java.util.Scanner;

public class no2 {
    /*
     1. menampilkan luas
     2. input jumlah tanah
     3. att panjang dan lebar
     */

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
    }
}
