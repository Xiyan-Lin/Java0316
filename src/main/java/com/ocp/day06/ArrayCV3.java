package com.ocp.day06;
// 1.調查五位學生之身高及體重如下，試比較其分散程度。
            //身高：172、168、164、170、176(公分)
            //體重：62、57、58、64、64(公斤)
public class ArrayCV3 {
    public static void main(String[] args) {
       double[] h = {172, 168, 164, 170, 176};
       double cvh = MyMath.cv(h);
       System.out.printf("H 的 CV值為: %.1f%%\n", cvh*100);
       
       double[] w = {62, 57, 58, 64, 64}; 
       double cvw = MyMath.cv(w);
        System.out.printf("W 的 CV值為: %.1f%%\n", cvw*100);
        
        String result = (cvh < cvw)? "身高":"體重"; 
        System.out.printf("%s集中度較高", result);
    }
}
