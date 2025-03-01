import java.util.Arrays;
import java.util.HashSet;

public class Last5th {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,1,5,5};
        HashSet<Integer> hs= new HashSet();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]==arr[i]||arr[i+1]==arr[i])
            {
                hs.add(arr[i]);
            }
        }
        System.out.println(hs);
    }
}
