package com.wxt.pkg.string;

public class StringDemo1 {
    public static void main(String[] args) {
//        直接双引号得到字符串对象，封装字符串数据
        String name="wxt";
        System.out.println(name);

//        new String创建字符串对象
        String rs1=new String();
        System.out.println(rs1);

        String rs2=new String("wxr");
        System.out.println(rs2);
        char[] chars={'w','x','t'};
        String rs3=new String(chars);
        System.out.println(rs3);

        byte[] bytes={97,98,99};
        String rs4=new String(bytes);
        System.out.println(rs4);
    }
}
