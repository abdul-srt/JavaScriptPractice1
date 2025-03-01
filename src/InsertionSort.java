import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={234,345,643,23,23,45,23,56};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
                else{
                    break;
                }
            }
        }

        return arr;
    }
}
