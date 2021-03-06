/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo1 {

    public static void main(String[] args) {
        int[][] m = new int[2][3];
        m[0][0] = 100;
        m[0][1] = 90;
        m[0][2] = 80;
        m[1][0] = 70;
        m[1][1] = 60;
        m[1][2] = 50;

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.println(m[i][k]);
            }
        }

        //改良
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                System.out.println(m[i][k]);
            }
        }

        //改良2 for each
        for (int[] x : m) {
            for (int y : x) {
                System.out.println(y);
            }

        }
    }
}