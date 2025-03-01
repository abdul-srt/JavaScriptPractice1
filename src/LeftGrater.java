public class LeftGrater {

    public static void main(String[] args) {
        int arr[]={3,3,3,3};
        System.out.println(check(arr));


    }


    static int check(int arr[])
    {   int count=0;
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            if(arr[i]>arr[j])
            {
                count+=1;

            }
        }


        return count;
    }

}
