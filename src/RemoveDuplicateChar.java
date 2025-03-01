import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s="Propgpramming";
        s=s.toLowerCase();

        Set<Character> set= new HashSet<>();
     removeDuplicate(s,set);
        for (Character c : set) {
            System.out.print(c+" ");
        }




    }

    static void removeDuplicate(String S,Set<Character> s)
    {
        StringBuilder b=new StringBuilder();

        char[] ch=S.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            char chr=S.charAt(i);
            int idx=S.indexOf(chr,i+1);
            if(idx==-1)
            {
                s.add(chr);
            }


        }





    }
}
