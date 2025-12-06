package org.example;

import java.util.Stack;

class Node1{
    int data;
    Node1 next;

    Node1(int new_data) {
        data = new_data;
        next = null;
    }
}
public class ReverseSingleLinkedlist {

    static Node1 ReverseList(Node1 head){

        Stack<Node1> stack = new Stack<>();
        Node1 temp = head;

         while(temp!=null){
             stack.push(temp);
             temp = temp.next;
         }

         if(!stack.isEmpty()){
             head = stack.pop();
             temp = head;

             while (!stack.isEmpty()){
                 temp.next = stack.pop();
                 temp = temp.next;
             }
             temp.next = null;
         }
        return head;
    }

    static void printList(Node1 node1){
        while (node1 !=null){
            System.out.println(node1.data);
            if (node1.next !=null){
               System.out.println(" -> ");
                node1 = node1.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);

        head = ReverseList(head);
        printList(head);
    }

}
