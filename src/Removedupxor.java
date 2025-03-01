public class Removedupxor {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4};
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans^=arr[i];
            ans^=i;
        }

        System.out.println(ans);
    }
}
