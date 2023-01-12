package com.driver;

public class Main {
    public static void main(String[] args) {
    RWOnly obj=new RWOnly();
    // error: 'name' has private access in 'com.driver.RWOnly'
//    obj.name="what";

        //error: 'name' has private access in 'com.driver.RWOnly'
//        System.out.println(obj.name);
        obj.setName("Chaubey");
        System.out.println(obj.getName());
    }
}