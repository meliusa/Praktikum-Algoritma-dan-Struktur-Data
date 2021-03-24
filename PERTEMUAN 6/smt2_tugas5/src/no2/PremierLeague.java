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
public class PremierLeague {

    public String team;
    public int play, goal, point;

    PremierLeague(String t, int p, int g, int pt) {
        team = t;
        play = p;
        goal = g;
        point = pt;
    }

    void tampil() {
        System.out.println("Team : " + team);
        System.out.println("Play : " + play);
        System.out.println("Goal : " + goal);
        System.out.println("point : " + point);
    }

}
