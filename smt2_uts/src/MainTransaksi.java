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

public class MainTransaksi {

    public static void main(String[] abcd) {

        int menu1 = 0;
        boolean running = true;

        Scanner asd = new Scanner(System.in);

        Service svc = new Service();

        Rekening r1 = new Rekening("160309273084", "bin Abdul Salam", "Aruffin", "14582643263", "ligula.Nullam@tacitisociosqu.edu");
        Rekening r2 = new Rekening("169712042416", "Al Hafeezy", "Mohammad", "16834168323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening r3 = new Rekening("161007278862", "bin Azzarudin", "Ehsan", "6505379", "Proin.eget@velitegestaslacinia.ca");
        Rekening r4 = new Rekening("161807297229", "Fadhullah", "Jeanne Roselia", "8638209", "Pellentesque.ut.ipsum@neque.ca");
        Rekening r5 = new Rekening("169503136823", "Nohara", "Shinnosuke", "5926919", "tellus.justo.sit@commodoauctor.net");
        Rekening r6 = new Rekening("168507083528", "Nohara", "Hiroshi", "11153397678", "dictum@nec.edu");
        Rekening r7 = new Rekening("160802059329", "Nohara", "Misae", "18917032664", "vel@ullamcorpermagna.co.uk");
        Rekening r8 = new Rekening("160806282695", "Nohara", "Himawari", "19786325110", "Aliquam.gravida@vestibulumMauris.net");
        Rekening r9 = new Rekening("161309092979", "Nobi", "Nobita", "8171766", "interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening r10 = new Rekening("168902128688", "Takeshi", "Goda", "16754004501", "et.ultrices@a.co.uk");
        Rekening r11 = new Rekening("161410089963", "Kudo", "Shinichi", "5279085", "ut@aultriciesadipiscing.ca");
        Rekening r12 = new Rekening("165112227763", "Ai", "Haibara", "15644194285", "Proin.velit@Duisac.net");
        Rekening r13 = new Rekening("167206230943", "Mouri", "Ran", "9776690", "ac@nibhAliquamornare.com");
        Rekening r14 = new Rekening("167711267372", "Mouri", "Kogoro", "3535137", "cubilia.Curae.Phasellus@Duis.com");

        Transaksi t1 = new Transaksi(898214, 494048, 3587, "2021-03-09 07:54:42", "TF");
        Transaksi t2 = new Transaksi(770592, 334245, 444267, "2020-08-11 13:36:56", "TF");
        Transaksi t3 = new Transaksi(685302, 451002, 376442, "2020-05-23 07:34:53", "TF");
        Transaksi t4 = new Transaksi(297103, 396116, 779589, "2021-07-03 01:09:49", "TF");
        Transaksi t5 = new Transaksi(66190, 259150, 619774, "2021-09-09 03:57:30", "TF");
        Transaksi t6 = new Transaksi(234301, 278309, 547922, "2021-08-24 13:18:39", "TF");
        Transaksi t7 = new Transaksi(243306, 869468, 50283, "2021-03-12 03:40:16", "TF");
        Transaksi t8 = new Transaksi(371045, 991242, 602034, "2021-08-06 11:48:59", "TF");
        Transaksi t9 = new Transaksi(395170, 97058, 472273, "2021-05-02 10:53:31", "TF");
        Transaksi t10 = new Transaksi(862731, 561908, 109431, "2021-07-31 08:11:00", "TF");
        Transaksi t11 = new Transaksi(556798, 31387, 725426, "2021-03-27 06:18:20", "TF");
        Transaksi t12 = new Transaksi(873982, 896213, 846142, "2021-07-18 04:06:30", "TF");
        Transaksi t13 = new Transaksi(774247, 739406, 775848, "2020-10-24 01:39:00", "TF");
        Transaksi t14 = new Transaksi(66987, 823014, 868772, "2020-12-21 05:57:59", "TF");

        svc.tambahRekening(r1);
        svc.tambahRekening(r2);
        svc.tambahRekening(r3);
        svc.tambahRekening(r4);
        svc.tambahRekening(r5);
        svc.tambahRekening(r6);
        svc.tambahRekening(r7);
        svc.tambahRekening(r8);
        svc.tambahRekening(r9);
        svc.tambahRekening(r10);
        svc.tambahRekening(r11);
        svc.tambahRekening(r12);
        svc.tambahRekening(r13);
        svc.tambahRekening(r14);

        svc.tambahTransaksi(t1);
        svc.tambahTransaksi(t2);
        svc.tambahTransaksi(t3);
        svc.tambahTransaksi(t4);
        svc.tambahTransaksi(t5);
        svc.tambahTransaksi(t6);
        svc.tambahTransaksi(t7);
        svc.tambahTransaksi(t8);
        svc.tambahTransaksi(t9);
        svc.tambahTransaksi(t10);
        svc.tambahTransaksi(t11);
        svc.tambahTransaksi(t12);
        svc.tambahTransaksi(t13);
        svc.tambahTransaksi(t14);

        while (running) {
            System.out.println("");
            System.out.println(".:UTS:.");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");

            System.out.println("");
            System.out.print("Pilih (1-5) : ");
            menu1 = asd.nextInt();

            switch (menu1) {
                case 1:
                    svc.tampilRekening();
                    break;
                case 2:
                    svc.tampilTransaksi();
                    break;
                case 3:
                    svc.bubbleSortTransaksi();
                    break;
                case 4:
                    svc.bubbleSortRekening();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    running = false;
            }
        }
    }
}
