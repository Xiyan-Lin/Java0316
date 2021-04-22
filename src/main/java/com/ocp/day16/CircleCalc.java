
package com.ocp.day16;


public class CircleCalc {
    public static void main(String[] args) {
        double r = 15.0;
        CircleArea ca = new CircleAreaImpl();
        System.out.println(ca.getArea(r));
        // 匿名內部類別 (球園面積)
        CircleArea ca2 = new CircleArea(){
        @Override 
        public double getArea(double r){
            return r * r * Math.PI;
        }

        };
        System.out.println(ca2.getArea(r));
        
        // 匿名內部類別 (球園體積)
        CircleArea.CircleVolume ca3 = new CircleArea.CircleVolume(){
            @Override
            public double getVol(double s) {
               return  s * s * s * Math.PI /3 *4 ;
            }
            
            
            
        };
        System.out.println(ca3.getVol(r));
    }
}

