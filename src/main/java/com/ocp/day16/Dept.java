

package com.ocp.day16;


  public class Dept {
     private String name = "IT";
     public static final String companyName = "HALLA";
     //一般內部類別
    public class Staff {
        private String name = "John";
        public void job(){
            String name = "寫程式";
            System.out.printf("%s 在 %s公司的 %s 部們下 %s\n",
                    this.name, Dept.companyName,Dept.this.name, name);
        }
        
        
    } 
}
