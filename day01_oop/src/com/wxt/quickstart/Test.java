package com.wxt.quickstart;

public class Test {
    public static void main(String[] args){
//        目标：面向对象快速编程
//        1.创建一个学生对象
        Student s1=new Student();
        s1.name="张三";
        s1.chinese=100;
        s1.math=100;
        s1.printAverageScore();
        s1.printTotalScore();
    }

}
