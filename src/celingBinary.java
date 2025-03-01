public class celingBinary {
    public static void main(String[] args) {
        int target=10;
        int[] arr={1,2,3,4,5,5,9};
        int l=0;
        int ans=0;
        int h=arr.length;
        while(l<h)
        {
            int mid=l+h/2;
            if(target==mid)
                 ans= mid;
            else if (target<mid) {
                l=mid+1;
                if(l==target)
                    ans=l;

            } else if (target>mid) {
                h=mid-1;
              int pt=h;
                if(h==target)
                    ans=h;
                else if (h>target && h<pt) {
                    ans=h;
                }


            }

        }
        System.out.println(ans);
    }
}
