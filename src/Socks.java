import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Socks {

    public static void main(String[] args) {
        ArrayList<Integer> e=new ArrayList<>();
        e.add(12);
        e.add(20);
        e.add(20);
        e.add(10);
        e.add(10);
        e.add(30);
        e.add(50);
        e.add(10);
        e.add(20);
        Collections.sort(e);

        for(int i=0;i<e.size();i++)
        {
            System.out.println(e.get(i));

        }




    }
}
