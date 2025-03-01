import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[]={9,8,7,6,5,4,3};

        for(int i=0;i<arr.length-1;i++)
        {
            int small=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;

                }
            }
            int t=arr[small];
            arr[small]=arr[i];
            arr[i]=t;


        }
        System.out.println(Arrays.toString(arr));
    }
}
