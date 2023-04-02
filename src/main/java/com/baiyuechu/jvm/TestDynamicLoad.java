package com.baiyuechu.jvm;

public class TestDynamicLoad {
    static {
        System.out.println("-----------load TestDynamicLoad----------");
    }

    public static void main(String[] args) {
        new A();
        System.out.println("------------load test---------");
//        B b = null;
        B b = new B();
    }
}

class A {
    static{
        System.out.println("-------------load A-------------");
    }

    A() {
        System.out.println("------------initial A-----------");

    }
}

class B {
    static {
        System.out.println("----------load B----------");
    }

    B() {
        System.out.println("---------initial B-----------");
    }
}
