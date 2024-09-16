package com.wxt.thisdemo;

import com.wxt.thisdemo.Student;

public class Test {
    public static void main(String[] args) {
//        认识this，掌握this的使用场景
        Student s1=new Student();
        System.out.println(s1);
        s1.printThis();
        System.out.println("_______________");
        Student s2=new Student();
        s2.score=250;
        System.out.println(s2);
        s2.printThis();
        s2.printPass(255);
    }

}
