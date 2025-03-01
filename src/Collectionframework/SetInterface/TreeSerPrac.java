package Collectionframework.SetInterface;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSerPrac {
    public static void main(String[] args) {
        TreeSet<Integer> hs=new TreeSet<>(Comparator.reverseOrder());

        hs.add(12);
        hs.add(11);
        hs.add(10);
        hs.add(9);
        hs.add(8);
        System.out.println(hs);
        System.out.println(hs.contains(12));


        System.out.println(hs.size());

        System.out.println(hs.isEmpty());



    }

    }

