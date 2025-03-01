import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s="aaaaaaaasadl";
        System.out.println(fun(s));

    }

    static int fun(String s)
    {
        int max=1;
        int count=0;
        Set<Character> charSet = new HashSet<>();


        for(int i=0;i<s.length();i++)
        {
            if(charSet.add(s.charAt(i)))
            {
                count++;
                if(count>max)
                {
                    max=count;
                }

            }
            else{

                count=0;

                charSet.clear();
            }
        }
        return max;
    }
}





