package com.wxt.quickstart;

//学生对象的模版
public class Student {
//    成员变量
    String name;
    double chinese;
    double math;
//    成员方法（对象的行为）
    public void printTotalScore(){
        System.out.println(name+"的总成绩是："+(chinese+math));
    }
    public void printAverageScore(){
        System.out.println(name+"的平均成绩是："+(chinese+math)/2.0);
    }
}
