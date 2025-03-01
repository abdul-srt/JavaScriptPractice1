public class RecursionCheck
{
    public static void main(String[] args) {

        recall(1);
    }

    public static void recall(int a)
    {
        System.out.println(a);
        recall(a+1);
    }
}

