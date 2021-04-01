
package com.ocp.day08;


public class MultiArrayDemo3 {
    public static void main(String[] args) {
        double[][] hw = {{170,60},{160,45},{180,90}};
        //求bmi
        //double[] bmi = {0,0,0};
        //for (int i = 0; i < hw.length; i++) {
           // for (int k = 0; k < hw[i].length; k++) {
             // double ans[];
              //   = hw[i][1]/Math.pow(hw[0][k]/100, 2);
              //  System.out.println();
        for(double[] x : hw){
            double h = x[0];
            double w = x[1];
            double bmi = w/ Math.pow(h/100,2);
            }
        }
    }
  

