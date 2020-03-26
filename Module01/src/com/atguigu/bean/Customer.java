package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {

    private static final Customer cust = new Customer();
    public static final Customer Cust = new Customer();
    /**
     * 自定义的int
     */
    private int iNum = 1;
    /**
     * 自定义的string
     */
    private String strTest = "hello world";

    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> arrlist = new ArrayList<String>();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Customer.main");
        System.out.println("arrlist = " + arrlist);
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1);
        for (int i = 0; i <arrlist.size() ; i++) {
            System.out.println(arrlist);
        }
        for (Object o : arrlist) {

        }
        ArrayList<String> strings = new ArrayList<>();
        for (String string : strings) {

        }
        for (int i = 0; i < strings.size(); i++) {
            
        }
        for (int i = strings.size() - 1; i >= 0; i--) {
            
        }
        if (strings != null) {

        }
        if (strings == null) {

        }
        String str = "123";
        if (str != null) {

        }
        if (str == null) {

        }

    }
    public void testUpdate() {
        //无形参测试方法
        System.out.println("Fuck you!");

        Customer cust = new Customer();
        cust.iNum = 2;
        cust.strTest = "123";
    }
}
