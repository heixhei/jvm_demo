package com.baiyuechu.jvm;

public class Math {
    private static int initDate = 666;
    private static User user = new User();

    public int compute() {  //一个方法对应一块栈帧内存区域
        int a=1;
        int b=2;
        int c = (a + b) / 2;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
    }
}
