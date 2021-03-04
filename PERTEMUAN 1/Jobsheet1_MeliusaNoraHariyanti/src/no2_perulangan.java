
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
public class no2_perulangan {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        System.out.print("Masukan NIM : ");
        String nim = masuk.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2, nim.length()));
        if (n < 10) {
            n += 10;
        }

        System.out.println("=================");
        System.out.println("n = " + n);

        for (int i = 0; i < n; i++) {
            System.out.print(hari[i % 7] + " ");
        }
    }
}
