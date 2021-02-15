/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class no2 {

    public static void main(String[] args) {
        double saldo_awal = 1000000, bunga = 0.02 * saldo_awal;
        Boolean running = true;
        int counter = 0;

        while (running) {
            saldo_awal += bunga;
            counter += 1;
            if (saldo_awal == 1500000) {
                running = false;
            }
        }
        System.out.println("Menabung selama " + counter + " bulan.");
    }
}
