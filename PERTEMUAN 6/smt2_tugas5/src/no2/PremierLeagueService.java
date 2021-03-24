/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

/**
 *
 * @author Meliusa
 */
public class PremierLeagueService {

    PremierLeague[] leagues = new PremierLeague[20];
    public int idx;

    void tambah(PremierLeague pt) {
        if (idx < leagues.length) { 
            leagues[idx] = pt;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (PremierLeague pt : leagues) {
            pt.tampil();
            System.out.println("--------------------------");
        }
    }

    public void insertionSort(boolean asc) {
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague tmp = leagues[i];
            int j = i;

            if (asc) {
                while (j > 0 && leagues[j - 1].point > tmp.point) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && leagues[j - 1].point < tmp.point) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            }
            leagues[j] = tmp;
        }
    }

}
