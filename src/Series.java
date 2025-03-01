import java.util.Arrays;

public class Series {
    public static void main(String[] args) {
        System.out.println(        fac(10));
        System.out.println(".................");
        for(int i=2;i<100;i+=2)
        {
            System.out.println(i);
        }
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<=10;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
        int fac=1;
        for(int i=1;i<=10;i++)
        {
            fac*=i;
            System.out.println(fac);
        }

        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
    static int fac(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fac(n-1);
    }
}
