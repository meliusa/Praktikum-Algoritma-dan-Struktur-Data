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

public class no4 {

    static double luasSegitiga(int a, int t) {
        double luas = 0.5 * (a * t);
        return luas;
    }

    static int luasPersegiPanjang(int p, int l) {
        int luas = p * l;
        return luas;
    }

    static double luasLingkaran(double r) {
        double luas = 3.14 * (r * r);
        return luas;
    }

    public static void main(String[] args) {

        try {
            int menu;

            Scanner asd = new Scanner(System.in);

            System.out.println("==============================");
            System.out.println("   MARI BELAJAR MATEMATIKA");
            System.out.println("==============================");
            System.out.println("1. Menghitung Luas Segitiga");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Menghitung Luas Lingkaran");

            System.out.println("");
            System.out.print("Pilih >> ");
            menu = asd.nextInt();

            switch (menu) {
                case 1:

                    Scanner asd1 = new Scanner(System.in);
                    System.out.print("Masukkan Alas : ");
                    int a = asd1.nextInt();
                    System.out.print("Masukkan Tinggi : ");
                    int t = asd1.nextInt();

                    System.out.println("------------------------------");
                    System.out.println("Luas Segitiga adalah " + luasSegitiga(a, t));
                    break;
                case 2:
                    Scanner asd2 = new Scanner(System.in);
                    System.out.print("Masukkan Panjang : ");
                    int p = asd2.nextInt();
                    System.out.print("Masukkan Lebar : ");
                    int l = asd2.nextInt();

                    System.out.println("------------------------------");
                    System.out.println("Luas Persegi Panjang adalah " + luasPersegiPanjang(p, l));
                    break;
                case 3:
                    Scanner asd3 = new Scanner(System.in);
                    System.out.print("Masukkan Panjang Jari-jari : ");
                    int r = asd3.nextInt();

                    System.out.println("------------------------------");
                    System.out.println("Luas Lingkaran adalah " + luasLingkaran(r));
                    break;
                default:
                    System.out.println("------------------------------");
                    System.out.println("Maaf, pilihan Anda tidak ada.");
            }
        } catch (Exception e) {
            System.out.println("------------------------------");
            System.out.println("Maaf, yang Anda inputkan salah.");
        }
    }
}
