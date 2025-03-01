import java.util.Arrays;
import java.util.Collection;

public class MoveZeros {
    public static void main(String[] args)
    {
        int arr[]={0,12,3,0,3,4,0,23,0};
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        for(int i=j+1;i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                arr[i]=0;
                j++;

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString( move(arr)));
    }
    static int[] move(int arr[])
    {
          int counter=-1;
          int pre=0;
          int cre=0;
          for (int i=pre;i<arr.length;i++)
          {
              if(arr[i]==0)
              {counter=i;
                  pre=i;
                  break;
          }}
          for(int j=pre+1;j<arr.length;j++) {
              if (arr[j] != 0) {
                  arr[pre] = arr[j];
                  arr[j] = 0;
              }
          }
          return arr;
    }

}

