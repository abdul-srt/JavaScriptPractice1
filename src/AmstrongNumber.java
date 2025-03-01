public class AmstrongNumber {

    public static void main(String[] args) {
        System.out.println(amstrong(153));

    }

    static boolean amstrong(int num)
    {
        String p= Integer.toString(num);
        int l=p.length();

        int n=num;
        int sum=0;
        while(num>0)
        {

            int r=num%10;

            sum+=Math.pow(r,3);
            num=num/10;



        }

        if(sum==n)
            return true;
        else{
            return false ;
        }
    }
}
