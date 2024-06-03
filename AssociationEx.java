//package com.practise;

import java.util.List;
import java.util.ArrayList;

class Mobile {
    private long mobileno;

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }
}

class Employee {
    private String name;
    private List<Mobile> mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getMobile() {
        return mobile;
    }

    public void setMobile(List<Mobile> mobile) {
        this.mobile = mobile;
    }
}

public class AssociationEx {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ashish Patel");

        Mobile nu = new Mobile();
        nu.setMobileno(82783276L);
        
        Mobile nu1 = new Mobile();
        nu1.setMobileno(82783276L);

        List<Mobile> numlist = new ArrayList<Mobile>();
        numlist.add(nu);
        numlist.add(nu1);

        emp.setMobile(numlist);

        System.out.println(emp.getName());
        for (Mobile mobile : emp.getMobile()) {
            System.out.println(mobile.getMobileno());
        }
    }
}

  // Output :- Ashish Patel
  //	    82783276
  //	    82783276