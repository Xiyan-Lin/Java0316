
package com.ocp.day08;


public class MultiArrayDemo4 {
    public static void main(String[] args) {
        double[][] hw = {{170,160,180},{60,45,90}};
        for (int i = 0; i < hw.length+1; i++) {
             
               double bmi =0;
               bmi = (hw[1][i]/ Math.pow(hw[0][i]/100, 2));
               
               System.out.println(bmi);
        }
    }
}
