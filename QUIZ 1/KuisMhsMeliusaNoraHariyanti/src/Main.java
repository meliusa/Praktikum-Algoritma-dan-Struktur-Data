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

public class Main {

    public static void main(String[] args) {

        try {
            SepedaMotor sm = new SepedaMotor();
            int pilih, pilih1, pilih2;
            boolean running = true;

            System.out.println("============================");
            System.out.println("       SEPEDA MOTOR");
            System.out.println("============================");
            System.out.println("1. Honda");
            System.out.println("2. Yamaha");
            System.out.println("3. Ducati");
            System.out.println("4. Suzuki");

            Scanner asd = new Scanner(System.in);

            System.out.println("");
            System.out.print("Pilih >> ");
            pilih = asd.nextInt();

            if (pilih > 0 && pilih < 5) {

                if (pilih == 1) {
                    sm.merk = "Honda";
                } else if (pilih == 2) {
                    sm.merk = "Yamaha";
                } else if (pilih == 3) {
                    sm.merk = "Ducati";
                } else if (pilih == 4) {
                    sm.merk = "Suzuki";
                }

                while (running) {
                    System.out.println("");
                    System.out.println("----------------------------");
                    System.out.println("");
                    sm.info();

                    System.out.println("");
                    System.out.println("----------------------------");
                    System.out.println("");
                    System.out.println("1. Nyalakan motor");
                    System.out.println("2. Matikan motor");
                    System.out.println("3. Menambah kecepatan motor");
                    System.out.println("4. Mengurangi kecepatan motir");
                    System.out.println("5. Ganti motor");
                    System.out.println("6. Hentikkan program");

                    Scanner asd1 = new Scanner(System.in);

                    System.out.println("");
                    System.out.print("Pilih >> ");
                    pilih1 = asd1.nextInt();

                    switch (pilih1) {
                        case 1:
                            sm.nyalakanMotor(true);
                            break;
                        case 2:
                            sm.matikanMotor(true);
                            break;
                        case 3:
                            sm.tambahKecepatanMotor(5);
                            break;
                        case 4:
                            sm.kurangiKecepatanMotor(5);
                            break;

                        case 5:
                            System.out.println("============================");
                            System.out.println("       SEPEDA MOTOR");
                            System.out.println("============================");
                            System.out.println("1. Honda");
                            System.out.println("2. Yamaha");
                            System.out.println("3. Ducati");
                            System.out.println("4. Suzuki");

                            Scanner asd2 = new Scanner(System.in);

                            System.out.println("");
                            System.out.print("Pilih >> ");
                            pilih2 = asd2.nextInt();

                            if (pilih2 > 0 && pilih2 < 5) {

                                if (pilih2 == 1) {
                                    sm.merk = "Honda";
                                } else if (pilih2 == 2) {
                                    sm.merk = "Yamaha";
                                } else if (pilih2 == 3) {
                                    sm.merk = "Ducati";
                                } else if (pilih2 == 4) {
                                    sm.merk = "Suzuki";
                                }
                            } else {
                                System.out.println("");
                                System.out.println("----------------------------");
                                System.out.println("");
                                System.out.println("Maaf, pilihan Anda tidak ada.");
                            }
                            break;
                        case 6:
                            running = false;
                            break;
                        default:
                            System.out.println("");
                            System.out.println("----------------------------");
                            System.out.println("");
                            System.out.println("Maaf, pilihan Anda tidak ada.");
                            running = false;
                    }
                }
            } else {
                System.out.println("");
                System.out.println("----------------------------");
                System.out.println("");
                System.out.println("Maaf, pilihan Anda tidak ada.");
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Maaf, inputan yang Anda masukkan salah.");
        }

    }
}
