public class Reverse {
    public static void main(String[] args) {

        String a="Computer";

        StringBuilder b= new StringBuilder("");
        String c="";
        for(int i=0;i<a.length();i++)
        {
            b=b.insert(0,a.charAt(i));
        }
        System.out.println(b);

        for(int i=0;i<a.length();i++)
        {
            c=a.charAt(i)+c;
        }
        System.out.println(c);
    }
}
