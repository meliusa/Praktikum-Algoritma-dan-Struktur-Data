/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class PacMan {

    //                baris, kolom
    int x = 0, y = 0, width, height;

    void moveLeft() {
        x -= 1;
    }

    void moveRight() {
        x += 1;
    }

    void moveUp() {
        y -= 1;
    }

    void moveDown() {
        y += 1;
    }

    void printPosition() {

        String[][] arena = new String[width][height];

        if (x < 0 || x > width - 1 || y < 0 || y > height - 1) {
            width = 0;
            height = 0;
        } else {
            System.out.println("------------------------------------");
            System.out.println("            ARENA PACMAN");
            System.out.println("------------------------------------");

            //input arena
            for (int i = 0; i < arena.length; i++) {
                for (int j = 0; j < arena[0].length; j++) {
                    if (i == y && j == x) {
                        arena[i][j] = "x";
                    } else {
                        arena[i][j] = "o";
                    }
                }
            }

            //show arena
            for (int i = 0; i < arena.length; i++) {
                for (int j = 0; j < arena[0].length; j++) {
                    System.out.print(arena[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("------------------------------------");
        }
    }
}
