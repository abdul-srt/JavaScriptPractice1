public class SubArraySum {
    public static void main(String[] args) {
        int arr[]={3,4,-7,1,3,3,1,4};
        int target=7;
        System.out.println(cal(arr,target));

    }
    public static int cal(int arr[],int t)
    {  int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==t)
                {count+=1;
                    
                }
            }

        }

        return count;
    }

}
