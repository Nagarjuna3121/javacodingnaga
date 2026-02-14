package org.example;

import java.util.ArrayList;

//Queue follows first in first out principle
public class ImplementQueueUsingArrayList {

    private ArrayList<Integer> list = new ArrayList<>();

    public void enqueue(Integer i){
        list.add(i);
    }
   public Integer dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return null;
        }
        return list.remove(0);

   }

    private boolean isEmpty() {
        return list.isEmpty();
    }

    public Integer front(){
        return list.get(0);
    }

    public static void main(String[] args) {
        ImplementQueueUsingArrayList queue = new ImplementQueueUsingArrayList();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
