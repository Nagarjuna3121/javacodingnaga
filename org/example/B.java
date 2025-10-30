package org.example;


class A{
    static int a = 1;
    static {
        System.out.println(a);
    }
}
public class B{
    static int b = 1;
    static {
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(A.a);
        System.out.println(B.b);
    }
}
