package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={32,87,2,99,24,8,6,5};
        int n=arr.length;
        System.out.println(bubble(arr,n));

    }
    static int[] bubble(int arr[],int n){

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
               if(arr[j]>arr[j+1])
               {
                   int x=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=x;
               }

            }
        }
        System.out.println(Arrays.toString(arr));
return arr;
    }
}
