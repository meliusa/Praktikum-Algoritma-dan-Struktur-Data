/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Rekening {

    public String noRekening, namaDepan, namaBelakang, Phone, Email;
    
    Rekening(){
        
    }
    
    Rekening(String a, String b, String c, String d, String e) {
        noRekening = a;
        namaDepan = b;
        namaBelakang = c;
        Phone = d;
        Email = e;
    }

    void tampil() {
        System.out.println("");
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Nama Depan : " + namaDepan);
        System.out.println("Nama Belakang : " + namaBelakang);
        System.out.println("No HP : " + Phone);
        System.out.println("Email : " + Email);
    }

}
