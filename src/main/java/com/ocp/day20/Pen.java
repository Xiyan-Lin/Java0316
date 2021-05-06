
package com.ocp.day20;

import java.util.Objects;

public class Pen {
    private String color; 
    private int price;

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    // 宣告equals在類別中的定義
    /*@Override
    public boolean equals(Object obj) {
        Pen p = (Pen)obj;
        if(price == p.price && color.equals(p.color)){
        return true;
        }
    return false;
    }

    // hashcode 演算法
    @Override
    public int hashCode() {
     return 7 * 11 * color.hashCode() * price;
        }*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.color);
        hash = 37 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pen other = (Pen) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Pen{" + "color=" + color + ", price=" + price + '}';
    }
    
}
