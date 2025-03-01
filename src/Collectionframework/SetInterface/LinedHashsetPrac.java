package Collectionframework.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinedHashsetPrac {
    public static void main(String[] args) {
        /*LinkedHashset impliments the Set Interface and not sore duplicate element like calss Hashset
        in that order of insertion in not maintained but in linkedHashset order of Insertion in maintained*/
        HashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(12);
        hs.add(11);
        hs.add(10);
        hs.add(9);
        hs.add(8);
        System.out.println(hs);
        System.out.println(hs.contains(12));


        System.out.println(hs.size());

        System.out.println(hs.isEmpty());

        System.out.println(hs.clone());

    }
}
