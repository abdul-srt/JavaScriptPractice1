package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={54,2,89,23,4};
        int n=arr.length;
        Selection(arr,n);

    }
    static void Selection(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {  int min=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;

            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
