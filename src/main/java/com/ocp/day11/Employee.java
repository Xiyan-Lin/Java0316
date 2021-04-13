
package com.ocp.day11;


public class Employee {
    private int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "Salary=" + Salary + '}';
    }
}
