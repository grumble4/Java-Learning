package com.wxt.javabean;

public class test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setScore(90);
        System.out.println(s1.getScore());
        System.out.println(s1.getName());
        StudentOperator operator=new StudentOperator(s1);
        operator.printPass();
    }
}

