/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Lingkaran {

    double phi = 3.14, r;

    double hitungLuas(double r) {
        return phi * (r * r);
    }

    double hitungKeliling(double r) {
        return phi * (2 * r);
    }

}
