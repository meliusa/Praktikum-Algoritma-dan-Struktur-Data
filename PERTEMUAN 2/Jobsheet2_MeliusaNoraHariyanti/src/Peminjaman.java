/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Peminjaman {
    /*
     data yang dicatat ketika melakukan peminjaman :
     1. id
     2. nama member
     3. nama game
     4. lama pinjam (hari)
     5. harga sewa / hari  
    
     setiap peminjaman bisa menampilkan data : 
     1. hasil peminjaman
     2. harga yang harus dibayar
    
     soal !
     buatlah : 
     1. class diagram
     2. program
     */

    int id_member, lama_pinjam, harga_sewa, bayar;
    String nama_member, nama_game;

    int idMember(int i) {
        return id_member = i;
    }

    String namaMember(String nm) {
        return nama_member = nm;
    }

    String namaGame(String ng) {
        return nama_game = ng;
    }

    int lamaPinjam(int lp) {
        return lama_pinjam = lp;
    }

    int hargaSewa(int hs) {
        return harga_sewa = hs;
    }

    int bayar(int b) {
        return bayar = b;
    }

    int hitungTotal(int hs, int lp) {
        return hs * lp;
    }

    //ht = hitung total
    int hitungKembali(int ht, int b) {
        return ht - b;
    }

    void tampil_data() {
        System.out.println("================================");
        System.out.println("         DATA PEMINJAM");
        System.out.println("================================");
        System.out.println("o> ID MEMBER\t: " + id_member);
        System.out.println("o> NAMA MEMBER\t: " + nama_member);
        System.out.println("o> NAMA GAME\t: " + nama_game);
        System.out.println("o> LAMA PINJAM\t: " + lama_pinjam + "/HARI");
        System.out.println("o> HARGA SEWA\t: " + harga_sewa + "/HARI");
        System.out.println("---------------------------------");
        System.out.println("o> TOTAL\t: " + hitungTotal(harga_sewa, lama_pinjam));
    }

    void tampil_kembali() {
        System.out.println("--------------------------------- -");
        System.out.println("o> KEMBALI\t: " + hitungKembali(bayar, hitungTotal(harga_sewa, lama_pinjam)));
    }
}
