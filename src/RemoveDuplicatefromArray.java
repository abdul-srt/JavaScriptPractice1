import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatefromArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,1,3,2,3,9};
        int ans[]=new int[9];
        int p=0;
        for(int i=0;i<arr.length;i++)
        {   boolean flag=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;

                }
            }
            if(!flag)
            {
                ans[p]=arr[i];
                p++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
