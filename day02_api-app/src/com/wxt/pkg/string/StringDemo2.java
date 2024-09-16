package com.wxt.pkg.string;

public class StringDemo2 {
    public static void main(String[] args) {
//        快速熟悉String提供的处理字符串的常用方法
        String s="wxt";
//        获取字符串的长度
        System.out.println(s.length());
//        提取字符串中某个索引处位置的字符
        char c=s.charAt(1);
//        索引为1的字符
        System.out.println(c);
//        字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            System.out.println(ch);
        }

//        把字符串转化成字符数组，再进行遍历
        char[] chars=s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String s1=new String("hhh");
        String s2=new String("hhh");
        System.out.println(s1.equals(s2));//true
    }


}
