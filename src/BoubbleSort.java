import java.util.Arrays;

public class BoubbleSort {

 public static void main(String[] args) {
//        int arr[]={34,5,354,654,34,56,335};
        int arr[]={1,2,3,3,4};
        System.out.println(Arrays.toString(sort(arr)));


    }
    static int[] sort(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {    int swap=0;
            for(int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swap=1;
                }
            }
            if(swap==0)
                break;
        }

        return arr;
    }
}
