import java.util.Hashtable;

public class CountOfChar {
    public static void main(String[] args) {
        String a="ABABAABACOPAKCDWZ";
        char[] c=a.toCharArray();
        Hashtable<Character,Integer> count=new Hashtable<>();
//        count.put(null,1);


        for(char f:c){

            if(count.containsKey(f)) {
                count.put(f, count.get(f) + 1);
            }
            else{
                count.put(f,1);
            }
        }
        System.out.println(count);
    }
}
