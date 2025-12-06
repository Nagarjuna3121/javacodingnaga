package org.example;

import java.util.Arrays;

class Employee4 {
    private String id;
    private String name;

    /**
     * Employee constructor
     */
    public Employee4(String id, String name) { // constructor
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + "] ";
    }

}
public class CustomArrayListImplementation1<E> {
    private int size = 0;
    private Object[] data = {};
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayListImplementation1(){
        data = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if(size == data.length) {
            ensureCapacity1();
        }
        data[size++] = e;
    }

    public E get(int index){
        if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        return (E) data[index];
    }

    private void ensureCapacity1() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }

    public void display(){
        for(int i = 0;i<size;i++){
            System.out.println(data[i]+ "");
        }
    }



    public static void main(String[] args) {

        CustomArrayListImplementation1<Employee4> listImplementation1 = new CustomArrayListImplementation1<>();
        listImplementation1.add(new Employee4("1", "sam"));
        listImplementation1.add(new Employee4("2", "amy"));
        listImplementation1.add(new Employee4("3", "wil"));
        listImplementation1.add(new Employee4("4", "cat"));
        listImplementation1.add(new Employee4("1", "sam"));
        listImplementation1.add(new Employee4("2", "amy"));
        listImplementation1.display();
        System.out.println("\nelement at index "+1+" = "+listImplementation1.get(1));
    }
}
