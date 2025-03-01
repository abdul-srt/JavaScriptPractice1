import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length-1;
        for(int i=0;i< arr.length/2;i++)
        {
            int l=arr[n];
            arr[n]=arr[i];
            arr[i]=l;
            n--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
