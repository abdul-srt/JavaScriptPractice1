public class ReverseWord {
    public static void main(String[] args) {
        String S="Coding is not easy";

        String a[]=S.split(" ");
        StringBuilder b=new StringBuilder();
        for(int i=a.length-1;i>=0;i--)
        {
            b.append(a[i]+" ");
        }
        System.out.println(b.toString());
    }
}
