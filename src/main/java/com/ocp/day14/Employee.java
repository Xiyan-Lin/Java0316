
package com.ocp.day14;


    public abstract class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }
   
    
    public int getSalary() {
     return salary;
    }

    public void  getSalary(int Salary) {
        this.salary = Salary;
    }
    public abstract void job();
}
