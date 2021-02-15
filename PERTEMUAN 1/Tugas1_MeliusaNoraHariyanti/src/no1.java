/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class no1 {

    public static void main(String[] args) {

        //ani, budi, bina, cita
        int[] berat_pakaian = {4, 15, 6, 11};
        int total = 0;

        System.out.println("================================");
        System.out.println("         Smile Laundry");
        System.out.println("================================");
        System.out.println("o> 1kg pakaian : Rp4500");
        System.out.println("o> Berat pakaian > 10kg : diskon 5%");

        System.out.println("--------------------------------");

        for (int i = 0; i < berat_pakaian.length; i++) {
            if (berat_pakaian[i] > 10) {
                berat_pakaian[i] *= 4500;
                berat_pakaian[i] *= 0.05;
                total += berat_pakaian[i];
            } else {
                berat_pakaian[i] *= 4500;
                total += berat_pakaian[i];
            }
        }
        System.out.println("o> Total pendapatan Smile Laundry hari ini : " + total);
    }
}
