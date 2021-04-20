/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day15;


public class Fighter extends Airplane implements Weapon, Oil{

    @Override
    int speed() {
      return 2000;  
    }

    @Override
    public void shoot() {
        System.out.println("響尾蛇飛彈");
    }

    @Override
    public int spend() {
        return 10000;
    }

   
    
    
}
