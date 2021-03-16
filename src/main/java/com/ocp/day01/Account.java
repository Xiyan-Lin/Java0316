
package com.ocp.day01;


public class Account {
   private int balance; // 帳戶餘額
   
   // 查詢帳戶餘額的方法
   int getBalance(){
   return balance; //
   }
    void withdraw(int money) { //提款方法
        // 驗證money是否符合存款條件
        if (money <= 0){
            System.out.println("提款金額不符");
            return;
        }
        // 驗證MONEY 是否大於BALANCE
        if (money > balance) {
            System.out.println("帳戶餘額不足");
            return;
        }
        balance -= money; // balance = balance - money 
    }
    void deposit(int money) { //存款方法
        // 驗證MONEY是否符合存款條件
        if (money <= 0){
            System.out.println("存款金額不符");
            return; //存款方法到此結束
        }
        balance += money; // balance = balance + money  
    }
}
