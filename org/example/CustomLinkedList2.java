package org.example;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CustomLinkedList2 {
    private Node head;
    private int size= 0;

   public void add(int data){
       Node newNode = new Node(data);

       if(head == null){
          head = newNode;
       }else{
           Node current = head;
            while(current.next !=null){
                current = current.next;
            }
            current.next = newNode;

       }
size++;
   }

   public void addFirst(int data){
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
         size++;
   }


}
