/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author Meliusa
 */
public class MainLeague {

    public static void main(String[] abcd) {
        PremierLeagueService leagues = new PremierLeagueService();
        PremierLeague p1 = new PremierLeague("Liverpool", 29, 45, 82);
        PremierLeague p2 = new PremierLeague("Manchester City", 27, 39, 57);
        PremierLeague p3 = new PremierLeague("Leicester", 28, 26, 50);
        PremierLeague p4 = new PremierLeague("Chelsea", 29, 9, 48);
        PremierLeague p5 = new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
        PremierLeague p6 = new PremierLeague("Sheffield United", 28, 5, 43);
        PremierLeague p7 = new PremierLeague("Manchester United", 28, 12, 42);
        PremierLeague p8 = new PremierLeague("Tottenham Hotspur", 29, 7, 41);
        PremierLeague p9 = new PremierLeague("Arsenal", 28, 4, 40);
        PremierLeague p10 = new PremierLeague("Burnley", 29, -6, 39);
        PremierLeague p11 = new PremierLeague("Crystal Palace", 29, -6, 39);
        PremierLeague p12 = new PremierLeague("Everton", 29, -6, 37);
        PremierLeague p13 = new PremierLeague("Newcastle United", 29, -16, 35);
        PremierLeague p14 = new PremierLeague("Southampton", 29, -17, 34);
        PremierLeague p15 = new PremierLeague("Brighton & Hove Albion", 29, -8, 29);
        PremierLeague p16 = new PremierLeague("West Ham United", 29, -15, 27);
        PremierLeague p17 = new PremierLeague("Watford", 29, -17, 27);
        PremierLeague p18 = new PremierLeague("AFC Bournemouth", 29, -18, 27);
        PremierLeague p19 = new PremierLeague("Aston Villa", 27, -18, 25);
        PremierLeague p20 = new PremierLeague("Norwich City", 29, -27, 21);

        leagues.tambah(p1);
        leagues.tambah(p2);
        leagues.tambah(p3);
        leagues.tambah(p4);
        leagues.tambah(p5);
        leagues.tambah(p6);
        leagues.tambah(p7);
        leagues.tambah(p8);
        leagues.tambah(p9);
        leagues.tambah(p10);
        leagues.tambah(p11);
        leagues.tambah(p12);
        leagues.tambah(p13);
        leagues.tambah(p14);
        leagues.tambah(p15);
        leagues.tambah(p16);
        leagues.tambah(p17);
        leagues.tambah(p18);
        leagues.tambah(p19);
        leagues.tambah(p20);

        System.out.println("1. Asc");
        System.out.println("2. Desc");
        System.out.print("Pilih >> ");
        Scanner asd = new Scanner(System.in);
        int pilih = asd.nextInt();
        Boolean param;

        if (pilih == 1) {
            param = true;
        } else {
            param = false;
        }

        leagues.insertionSort(param);
        leagues.tampilAll();

    }
}
