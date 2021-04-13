
package com.ocp.day11;

 class Director extends Manager{
     private int stockOption;

    public int getStockOption() {
        return stockOption;
    }

    public void setStockOption(int stockOption) {
        this.stockOption = stockOption;
    }

    @Override
    public String toString() {
        return "Director{" + "stockOption=" + stockOption + "budget=" + getBudget() + ",salary=" + getSalary()+ '}';
    }

    

    
    
}
