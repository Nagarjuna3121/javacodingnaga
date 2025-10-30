package org.example;

class Parent {
    int value = 10;
    void show() { System.out.println("Parent"); }
}
class Child extends Parent {
    int value = 20;
    void show() {
        System.out.println("Child");
        System.out.println(super.value);
    }

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        Parent p1 = new Parent();
        p1.show();
        c.show();
        p.show();
    }
}
