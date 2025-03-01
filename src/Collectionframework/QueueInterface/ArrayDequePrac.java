package Collectionframework.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequePrac {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ArrayDeque<Integer> ad2=new ArrayDeque<>();

        ad.addFirst(2);
        ad.addFirst(1);
        ad.addLast(3);
        ad.addLast(99);
        System.out.println(ad);
        ad2.addLast(12);
        ad2.addLast(33);
        ad.addAll(ad2);
        System.out.println(ad);

        ad2.pollLast();
        ad.peekLast();
    }
}
