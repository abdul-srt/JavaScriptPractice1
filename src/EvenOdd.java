public class EvenOdd {
    public static void main(String[] args) {
        int num=3;
        String ans=check(num);
        System.out.println(ans);
    }
    public static String check(int num)
    {
        if(num%2==0)
            return "Even";
        return "Odd";
    }
}
