
package com.ocp.day01;


public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account(); // 建立a01帳戶 
        Account a02 = new Account(); // 建立a02帳戶
        Account a03 = new Account(); // 建立a03帳戶  
   
        System.out.printf("a01 帳戶餘額:$%,d \n", a01.getBalance());
        System.out.printf("a02 帳戶餘額:$%,d \n", a02.getBalance());
        System.out.printf("a03 帳戶餘額:$%,d \n", a03.getBalance());
        //各帳戶第一次存款
        a01.deposit(1000);
        a02.deposit(2000);
        a03.deposit(3000);
        // 存款
        System.out.println("存款後...");
        a01.deposit(500);
        System.out.printf("a01 帳戶餘額:$%,d \n", a01.getBalance());
        // 提款
        System.out.println("提款後...");
        a02.withdraw(500);
        System.out.printf("a02 帳戶餘額:$%,d \n", a02.getBalance());
        // 存款
        System.out.println("存款後...");
        a03.deposit(-1200);
        System.out.printf("a03 帳戶餘額:$%,d \n", a03.getBalance());
        // 提款
        System.out.println("提款後...");
        a03.withdraw(5000);
        System.out.printf("a03 帳戶餘額:$%,d \n", a03.getBalance());
}}
