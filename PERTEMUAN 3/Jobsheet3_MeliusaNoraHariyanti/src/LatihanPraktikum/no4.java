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
public class no4 {
    /*
     1. menampilkan nama, nim, jenis kelamin, dan juga IPK mahasiswa 
     */

    public static void main(String[] args) {

        int jml;

        Scanner asd = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("         DATA MAHASISWA");
        System.out.println("================================");

        System.out.println("");
        System.out.print("Masukkan jumlah mahasiswa >> ");
        jml = asd.nextInt();

        Scanner asd1 = new Scanner(System.in);

        Mahasiswa[] m = new Mahasiswa[jml];

        System.out.println("");
        for (int i = 0; i < jml; i++) {
            m[i] = new Mahasiswa();
            System.out.println("DATA MAHASISWA KE-" + (i + 1));
            System.out.print("Masukkan nama >> ");
            m[i].nama = asd1.nextLine();
            System.out.print("Masukkan nim >> ");
            m[i].nim = asd1.nextLine();
            System.out.print("Masukkan jenis kelamin >> ");
            m[i].jenis_kelamin = asd1.nextLine();
            System.out.print("Masukkan IPK >> ");
            m[i].ipk = asd1.nextLine();
            System.out.println("");
        }

        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");

        for (int i = 0; i < jml; i++) {
            System.out.println("DATA MAHASISWA KE-" + (i + 1));
            System.out.println("Nama >> " + m[i].nama);
            System.out.println("Nim >> " + m[i].nim);
            System.out.println("Jenis kelamin >> " + m[i].jenis_kelamin);
            System.out.println("IPK >> " + m[i].ipk);
            System.out.println("");
        }

    }
}
