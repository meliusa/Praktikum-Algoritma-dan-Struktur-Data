

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

public class no1 {

    public static void main(String[] args) {

        Boolean running = true;
        String jawab;

        while (running) {

            try {
                Scanner asd = new Scanner(System.in);

                System.out.println("=============================");
                System.out.println("         LINGKARAN");
                System.out.println("=============================");

                System.out.print("o> Jari-jari\t>> ");
                double input = asd.nextDouble();

                Lingkaran a = new Lingkaran();
                a.r = input;

                System.out.println("-----------------------------");
                System.out.println("o> Luas\t\t: " + a.hitungLuas(input));
                System.out.println("o> Keliling\t: " + a.hitungKeliling(input));

                Scanner asd1 = new Scanner(System.in);

                System.out.println("-----------------------------");
                System.out.println("");
                System.out.print("Mengulang.. (y/t) >> ");
                jawab = asd1.nextLine();

                //start - mengulang...
                if (jawab.equalsIgnoreCase("y")) {
                    System.out.println("");
                } else if (jawab.equalsIgnoreCase("t")) {
                    running = false;
                    System.out.println("Program dihentikan! Terimakasih, sampai berjumla lagi~!");
                } else {
                    System.out.println("-----------------------------");
                    System.out.println("Pilihan tidak ada.");
                    running = false;
                }
                //end - mengulang...
            } catch (Exception e) {
                System.out.println("-----------------------------");
                System.out.println("Inputan yang Anda masukkan salah.");
                running = false;
            }
        }
    }
}
