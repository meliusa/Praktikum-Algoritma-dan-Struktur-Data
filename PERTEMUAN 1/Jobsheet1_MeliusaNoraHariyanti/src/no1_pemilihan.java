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

public class no1_pemilihan {

    public static void main(String[] args) {

        double nilai_tugas, nilai_uts, nilai_uas, nilai_akhir;
        String nilai_huruf = "", jawab;
        Boolean running = true;

        while (running) {

            try {
                Scanner asd = new Scanner(System.in);

                System.out.println("==============================");
                System.out.println("Program Menghitung Nilai Akhir");
                System.out.println("==============================");

                System.out.print("Masukkan Nilai Tugas\t: ");
                nilai_tugas = asd.nextInt();

                System.out.print("Masukkan Nilai UTS\t: ");
                nilai_uts = asd.nextInt();

                System.out.print("Masukkan Nilai UAS\t: ");
                nilai_uas = asd.nextInt();

                nilai_akhir = (0.2 * nilai_tugas) + (0.35 * nilai_uts) + (0.45 * nilai_uas);

                if (nilai_tugas < 0 || nilai_tugas > 100 || nilai_uts < 0 || nilai_uts > 100 || nilai_uas < 0 || nilai_uas > 100) {
                    System.out.println("------------------------------");
                    System.out.println("Maaf, nilai tidak boleh kurang dari 0 atau lebih dari 100");
                } else {

                    System.out.println("------------------------------");
                    System.out.println("Nilai Akhir\t\t: " + nilai_akhir);
                    System.out.print("Nilai Huruf\t\t: ");

                    if (nilai_akhir < 39) {
                        System.out.print("E");
                        nilai_huruf = "E";
                    } else if (nilai_akhir > 39 && nilai_akhir <= 50) {
                        System.out.print("D");
                        nilai_huruf = "D";

                    } else if (nilai_akhir > 50 && nilai_akhir <= 60) {
                        System.out.print("C");
                        nilai_huruf = "C";

                    } else if (nilai_akhir > 60 && nilai_akhir <= 65) {
                        System.out.print("C+");
                        nilai_huruf = "C+";

                    } else if (nilai_akhir > 65 && nilai_akhir <= 73) {
                        System.out.print("B");
                        nilai_huruf = "B";

                    } else if (nilai_akhir > 73 && nilai_akhir <= 80) {
                        System.out.print("B+");
                        nilai_huruf = "B+";

                    } else if (nilai_akhir > 80 && nilai_akhir <= 100) {
                        System.out.print("A");
                        nilai_huruf = "A";

                    }

                    System.out.println("");

                    if (nilai_huruf.equals("A") || nilai_huruf.equals("B") || nilai_huruf.equals("B+") || nilai_huruf.equals("C") || nilai_huruf.equals("C+")) {
                        System.out.println("------------------------------");
                        System.out.println("Selamat! Anda Lulus.");
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("Maaf! Anda belum Lulus.");
                    }
                }
            } catch (Exception e) {
                System.out.println("------------------------------");
                System.out.println("Maaf, inputan yang Anda masukkan salah.");
                running = false;
            }

            Scanner asd1 = new Scanner(System.in);

            System.out.println("------------------------------");
            System.out.print("Apakah Anda ingin berhenti? (Y/T) : ");
            jawab = asd1.nextLine();

            if (jawab.equalsIgnoreCase("Y")) {
                running = false;
            } else if (jawab.equalsIgnoreCase("T")) {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            } else {
                running = false;
                System.out.println("------------------------------");
                System.out.println("Maaf, inputan yang Anda masukkan salah.");
            }
        }
    }
}
