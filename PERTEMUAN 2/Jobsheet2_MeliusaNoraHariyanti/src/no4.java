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

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("       GAME PACMAN BY MELIUSA");
        System.out.println("====================================");

        PacMan pm = new PacMan();

        Scanner asd = new Scanner(System.in);

        System.out.print("Masukkan lebar arena\t: ");
        pm.width = asd.nextInt();

        System.out.print("Masukkan tinggi arena\t: ");
        pm.height = asd.nextInt();

        pm.printPosition();

        boolean running = true;
        while (running) { //start running

            System.out.println("Arahkan PacMan dengan kode dibawah ini : ");
            System.out.println("1. Ke kanan");
            System.out.println("2. Ke Kiri");
            System.out.println("3. Ke Atas");
            System.out.println("4. Ke Bawah");

            Scanner asd1 = new Scanner(System.in);

            System.out.println("");
            System.out.print("Masukkan kode >> ");
            int pilih = asd1.nextInt();

            switch (pilih) {
                case 1:
                    pm.moveRight();
                    pm.printPosition();
                    break;
                case 2:
                    pm.moveLeft();
                    pm.printPosition();
                    break;
                case 3:
                    pm.moveUp();
                    pm.printPosition();
                    break;
                case 4:
                    pm.moveDown();
                    pm.printPosition();
                    break;
                default:
            }

            if (pm.width == 0 || pm.height == 0) {
                running = false;
            }

        } //end running
    }
}
