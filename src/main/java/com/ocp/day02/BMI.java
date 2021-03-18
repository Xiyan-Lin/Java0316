
package com.ocp.day02;

// 設計計算BMI應該要有的資源與方法
public class BMI {
    // 屬性定義區
        String name; // 姓名 
        double height; //身高
        double weight; // 體重
        
        //建構子設計區
        BMI (){
            }
        BMI(String n, double h, double w){
            name = n;
            height = h;
            weight = w;
            }
        
        //方法實作區
        double getBMIValue(){ //取得計算BMI的資料
            double bmiValue = weight/ Math.pow(height/100,2); //計算
            return bmiValue; //回傳與方法簽章一樣的型別
        }  
        String getResultValue() {
            double bmiValue = getBMIValue(); 
            String resultValue = (bmiValue > 23)? "過重" : (bmiValue < 18)? "過輕" : "正常";    
            return resultValue; 
        }    
        
        //列印資料
        void print() {
            double bmiValue = getBMIValue();
            String resultValue = getResultValue();
            System.out.printf("姓名:%s , 身高:%.1f ,體重:%.1f, BMI:%.2f, 結果:%s\n"
                    , name,height, weight,bmiValue, resultValue );
        }
        
       
}
