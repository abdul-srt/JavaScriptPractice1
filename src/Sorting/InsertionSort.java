package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={54,2,89,23,4};
        int n=arr.length;
        Insertion(arr,n);
    }
    static void Insertion(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
