package Collectionframework.QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        minheep();
        maxheep();

    }
   static void minheep(){
        PriorityQueue<String> q= new PriorityQueue<>();

        q.offer("Ammi");
        q.offer("Abba");
        q.offer("Sam");
        System.out.println(q.peek());
        q.add("rd");

        System.out.println(q);
    }

    static void maxheep(){
        PriorityQueue<String> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.offer("Ammi");
        q.offer("Abba");
        q.offer("Sam");
        q.offer("Rdaa");
        System.out.println(q.peek());

        System.out.println(q);

    }
}
