
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meliusa
 */
public class no4_fungsi {

    public static int fibbonaci_rekursif(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibbonaci_rekursif(n - 1) + fibbonaci_rekursif(n - 2));
        }
    }

    static void fibonacci_perulangan() {
        int a = 0, b = 0, c = 0;
        Scanner asd2 = new Scanner(System.in);

        System.out.print("Masukkan batas jumlah bilangan fibonacci: ");
        int jml = asd2.nextInt();
        
        System.out.println("");
        System.out.print("Hasil bilangan fibonasi : \n");
        a = 0;
        b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= jml; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {

        Scanner asd = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("          FIBONACCI");
        System.out.println("===============================");
        System.out.println("1. Perulangan");
        System.out.println("2. Rekursif");

        System.out.println("");
        System.out.print("Pilih >> ");
        int pilih = asd.nextInt();

        switch (pilih) {
            case 1:

                Scanner asd1 = new Scanner(System.in);

                int n,
                 i,
                 j = 0;
                System.out.print("Masukkan batas jumlah bilangan fibonacci: ");
                n = asd1.nextInt();
                System.out.println("Hasil bilangan fibonacci : \n");
                for (i = 1; i <= n; i++) {
                    System.out.println("fibonacci ke-" + i + ": " + fibbonaci_rekursif(j));
                    j++;
                }
                break;

            case 2:
                fibonacci_perulangan();
        }
    }
}
