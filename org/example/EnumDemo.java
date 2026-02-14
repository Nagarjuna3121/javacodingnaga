package org.example;

enum SingletonEnum {
    INSTANCE;

    private int value;

    public void setValue(int value){
        this.value = value;
            }

            public int getValue(){
        return value;
            }

    public void doSomething() {
        // Business logic here
        System.out.println("Singleton is doing something.");
    }
}

public class EnumDemo{
    public static void main(String[] args) {
SingletonEnum enumsingle = SingletonEnum.INSTANCE;
        enumsingle.doSomething();
        enumsingle.setValue(10);

        // Verifying it's the same instance
        SingletonEnum anotherSingleton = SingletonEnum.INSTANCE;
        System.out.println("Value from first instance: " + enumsingle.getValue());
        System.out.println("Value from second instance: " + anotherSingleton.getValue());
        System.out.println("Are both instances the same? " + (enumsingle == anotherSingleton)); // Output: true

    }
}


