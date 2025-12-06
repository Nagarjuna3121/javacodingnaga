package org.example;

public class StaticControlFlow {
    // initializing static integer a=100
    static int a = 100;

    // static main method
    public static void main(String[] args)
    {
        // calling static method print()
        print();
        System.out.println(
                "Main method has finished its execution");
    }
    static int b = 200;
    // first static block
    static
    {
        // displaying value of a
        System.out.println(a);

        // calling static method print()
        print();
        System.out.println("Inside First Static Block");
    }

    // static method print()
    public static void print()
    {
        // displaying value of b
        System.out.println(b);
    }

    // second static block
    static
    {
        System.out.println("Inside Second Static Block");
    }

    // initializing static integer b=200

}
