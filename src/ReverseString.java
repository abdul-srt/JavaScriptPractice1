public class ReverseString{
    public static void main(String[] args) {
        String s="Babu Bhai Ki jay";

        String result=reverseString(s);
        System.out.println(result);
    }

    static String reverseString( String s)
    {
        char ch[] =s.toCharArray();
        int ss=0;
        int ee=ch.length-1;
        for(int i=0;i<ch.length/2;i++){
            char t=ch[ss];
            ch[ss]=ch[ee];
            ch[ee]=t;

            ss++;
            ee--;



        }
        String ans=new String(ch);

        return ans;
    }









}