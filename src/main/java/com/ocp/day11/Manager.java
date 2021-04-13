
package com.ocp.day11;


public class Manager extends Employee{
   private int budget; 

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public String toString() {
       String salary;
        return "Manager{" + "budget=" + budget + ",salary=" + getSalary() + '}';
    }
}
