package com.itcast.proxy2.GenerateProxy;


import com.itcast.proxy2.Customer;
import com.itcast.proxy2.Person;

public class JdkTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
