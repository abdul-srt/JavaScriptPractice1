package ExceptionHandaling;

public class ExceptionPractice {

    public static void trycatch(int a, int b)
    {
        try{
            System.out.println("I am in Try block");
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Now in Catch block");
            System.out.println(e.getMessage());
            System.out.println("Hello program is running very good!");

        }
    }

    public static void finallyprac()
    {
        //
        int arr[]=new int[5];
        try {

            arr[9]=90;
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
           // System.out.println(e);
        }

        finally {
            System.out.println("I am in finally block");
        }
    }

    public static void throwsprac(String x) throws NullPointerException
    {
        try{
            System.out.println(x.length());
        }

        catch(NullPointerException e) {
            System.out.println("I am in finally block of throwsprac");
        }



    }
    public static void Throw(int age)
    {
        if(age<18)
        {
            throw new RuntimeException("Age should be grater than 18");
        }
    }


    public static void main(String[] args) {
        String x=null;
        trycatch(12,0);
        finallyprac();
        throwsprac(x);
        Throw(17);



    }
}
