package com.itcast.proxy2.cglibMeipo;

import com.itcast.proxy2.Customer;

public class CglibProxyTest {
    public static void main(String[] args) {
        try {
            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}