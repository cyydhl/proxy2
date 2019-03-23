package com.itcast.proxy2.jdkProxy;


import com.itcast.proxy2.Customer;
import com.itcast.proxy2.Person;

public class JdkTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new JDKMeipo().getInstance(new Customer());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
