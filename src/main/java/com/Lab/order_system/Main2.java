/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Lab.order_system;

import com.lab.order_system.DataCenter;
import com.lab.order_system.Food;
import com.lab.order_system.ServiceCenter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class Main2 {
private static List<Food> order = new ArrayList<>();
    private static DataCenter dc = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;

    public static void main(String[] args) {
        while (play) {
            menu();
        }

    }

    public static void menu() {
        sc.menu();
        System.out.print("請輸入:");
        Scanner scanner = new Scanner(System.in);
        int itemId = scanner.nextInt();
        switch (itemId) {
            case 1: // 檢視CATALOG
                sc.printCatalog();
                break;
            case 2: //新增訂單餐點
                System.out.println("請輸入NO:");
                int addNo = scanner.nextInt();
                // 在 ORDER 集合中加入 Food
                Food food = sc.getFoodByNo(addNo);
                order.add(food);
                break;
            case 3: //查詢訂單餐點
                for (int i = 0; i < order.size(); i++) {
                    System.out.printf("id: %d %s\n", i, order.get(i));
                }
                break;
            case 4: //取消訂單餐點
                System.out.println("請輸入取消NO:");
                int cancelId = scanner.nextInt();
                order.remove(cancelId);
                break;
            case 5: //刪除全部訂單
                order = new ArrayList<>();
                break;
            case 6: //結帳
                int sum = order.stream().mapToInt(Food::getPrice).sum();
                System.out.printf("結帳: %d\n", sum);
                order = new ArrayList<>();
                play = false;
                break;
            case 0: //離開
                play = false;

        }
    }
}
