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

public class no3 {

    public static void main(String[] args) {

        try {
            int batas;

            Scanner asd = new Scanner(System.in);

            System.out.print("Masukkan batas\t: ");
            batas = asd.nextInt();

            System.out.print("Hasil\t\t: ");

            for (int i = 2; i <= batas; i += 2) {
                if (i % 4 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Maaf, yang Anda inputkan salah.");
        }
    }
}
