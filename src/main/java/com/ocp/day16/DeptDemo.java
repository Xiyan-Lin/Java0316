
package com.ocp.day16;


public class DeptDemo {
    public static void main(String[] args) {
        Dept dept = new Dept();
        Dept.Staff staff = dept.new Staff();
        staff.job();
        // 第2種作法
        Dept.Staff staff2 = new Dept().new Staff();
        staff2.job();
        // 第3做法
        new Dept().new Staff().job();
    }
}
