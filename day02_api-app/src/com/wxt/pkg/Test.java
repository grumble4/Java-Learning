package com.wxt.pkg;

import com.wxt.pkg.extra.Demo1;
import com.wxt.pkg.other.Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.print();
        Demo1 d2=new Demo1();
        d2.print();

        Scanner sc=new Scanner(System.in);
        String s="黑马";
        Demo2 d3=new Demo2();
        d3.print();
        com.wxt.pkg.extra.Demo2 d4=new com.wxt.pkg.extra.Demo2();
        d4.print();
    }
}
