public class CheckSorted {
    public static void main(String[] args) {
        int arr[]={2,1,2,2,3,4};
        boolean flag=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
             flag=true;
            }
            else{
                flag=false;
            }
            if(flag==false)
            {
                break;
            }

        }
        if(flag)
        {
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Not Sorted Array");
        }
    }
}
