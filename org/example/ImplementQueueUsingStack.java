package org.example;

import java.util.Stack;

public class ImplementQueueUsingStack {

    static class MyQueue{
         private Stack<Integer> stack = new Stack<>();

          void enqueue(int x){
              stack.push(x);
          }

    }
}
