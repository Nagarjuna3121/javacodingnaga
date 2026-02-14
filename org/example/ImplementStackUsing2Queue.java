package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsing2Queue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x){
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
    }

    public void pop(){
        if(q1.isEmpty())
            return;
        q1.remove();
    }
}
