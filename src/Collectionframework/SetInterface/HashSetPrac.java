package Collectionframework.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        System.out.println(hs.add(12));
        System.out.println(hs.add(11));
        System.out.println(hs.add(10));
        System.out.println(hs.add(9));

        System.out.println(hs.contains(12));
        System.out.println(hs.remove(12));

        System.out.println(hs.size());

        System.out.println(hs.isEmpty());

        System.out.println(hs.clone());

    }
}
