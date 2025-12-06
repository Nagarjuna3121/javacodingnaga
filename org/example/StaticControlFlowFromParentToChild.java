package org.example;

class Base{
    static int x = 10;

    static {
        m1();
        System.out.println("base SB");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("base main");

    }

    public static void m1(){
        System.out.println("y");
    }
    static int y = 20;
}

public class StaticControlFlowFromParentToChild extends Base{

    static int  i =100;

    static {
        m2();
        System.out.println("DFSB");

    }

    public static void main(String[] args) {
        m2();
        System.out.println("derived main");
    }
    public static void m2(){
        System.out.println(j);
    }

    static {
        System.out.println("DSSB");
    }
    static int j = 200;
}
