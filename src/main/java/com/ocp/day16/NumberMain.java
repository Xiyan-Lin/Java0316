
package com.ocp.day16;


public class NumberMain {
    public static void main(String[] args) {
        // Lambda 實作 EvenNumber, n = 51 是否是偶數
        EvenNumber e = (int n)-> n % 2 == 0;
        System.out.println(e.isEven(51));
               
        // Lambda 實作 PrimeNumber, n = 9973 是否是質數
        PrimeNumber p = (n) -> {
                boolean v = true;
                
               for(int i=2; i<n ; i++){
                   if(n % i == 0){
                    v = false;
                    
                   }
               }
               return v;
        };
        System.out.println(p.isPrime(9973));
    }
}
