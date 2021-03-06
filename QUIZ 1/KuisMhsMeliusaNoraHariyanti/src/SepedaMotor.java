/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class SepedaMotor {

    String merk;
    Boolean kontakMotor = false;
    int kecepatanMotor;

    SepedaMotor() {

    }

    SepedaMotor(String m) {
        merk = m;
    }

    void nyalakanMotor(Boolean k) {
        if (kontakMotor == true) {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Maaf, motor Anda sudah dinyalakan.");
        } else {
            kontakMotor = true;
            kecepatanMotor = 0;
        }
    }

    void matikanMotor(Boolean k) {
        if (kontakMotor == false) {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Maaf, motor Anda sudah dimatikan.");
        } else {
            kontakMotor = false;
            kecepatanMotor = 0;
        }
    }

    void tambahKecepatanMotor(int k) {
        //max 100km
        if (kontakMotor == true) {
            if (kecepatanMotor <= 95) {
                kecepatanMotor += k;
            } else {
                System.out.println("");
                System.out.println("----------------------------");
                System.out.println("");
                System.out.println("Maaf, sudah mencapai batas maksimum.");
            }
        } else {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Maaf, motor Anda sedang dalam kondisi mati.");
        }

    }

    void kurangiKecepatanMotor(int k) {
        //min 0km
        if (kontakMotor == true) {
            if (kecepatanMotor >= 5) {
                kecepatanMotor -= k;
            } else {
                System.out.println("");
                System.out.println("----------------------------");
                System.out.println("");
                System.out.println("Maaf, sudah mencapai batas minimum.");
            }
        } else {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Maaf, motor Anda sedang dalam kondisi mati.");
        }
    }

    void info() {
        System.out.println("Motor yang dipilih\t: " + merk);
        System.out.print("Status motor\t\t: ");
        if (kontakMotor == true) {
            System.out.println("Hidup.");
        } else {
            System.out.println("Mati.");
        }
        System.out.println("Kecepatan sekarang\t: " + kecepatanMotor);
    }

}
