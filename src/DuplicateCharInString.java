import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String a ="Abdul bhaiaL";
       a= a.toLowerCase();
        char[] ch= a.toCharArray();

        Set<Character> as = new HashSet<>();
        Set<Character> ad = new HashSet<>();

        for(char pl: ch)
        {
            if(!as.add(pl))
            {
                ad.add(pl);
            }

        }

        for(char x: ad)
        {
            System.out.println(x);
        }

    }
}
