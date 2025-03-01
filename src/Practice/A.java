package Practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class A {
    public static void main(String[] args) {
        int arr[]={1,2,5,10,3,4,};
        int max=arr[0];
        int smax=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
        }
//        System.out.println(smax);
//
       B b=new B();
//        b.fibo();
//        b.facto();
//        System.out.println(b.recurfibo(10));
       // b.exception();
        b.queue();
    }



}
class B{

    void fibo()
    {
        int a=0;
        int b=1;

        for(int i=2;i<=10;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }


    void facto()
    {
        int fact=1;
        for(int i=1;i<=10;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }

    int recurfibo(int n)
    {
        int x=n;
        if(n==0)
        {
            return 1;
        }
        else{
            return n*recurfibo(n-1);
        }
    }


    void exception()
    {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            e.getMessage();
        }

        catch (Exception e)
        {
            e.getMessage();
        }


    }


    void queue()
    {
        PriorityQueue<Integer> q= new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(10);
        q.offer(12);
        q.offer(2);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
