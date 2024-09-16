package com.wxt.thisdemo;


public class Student {
    double score;
//    方法
    public void printThis(){
        System.out.println(this);
    }
//    形参里面的score
    public void printPass(double score){
//        第一个是当前学生对象的成绩
//        第二个是方法里面的形参
        if(this.score >= score) {
            System.out.println("恭喜你");
        }else {
            System.out.println("落选了");
        }
    }
}
