public class SecondLargestelement {
    public static void main(String[] args) {
        int arr[]={123,23,44,23,99,6,13,55,122};
        int max=arr[0];
        int pr=0;
        for(int i=0;i< arr.length;i++)
        {
           if(arr[i]>max)
           {

               max=arr[i];
           }
        }

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>pr && arr[i]!=max)

            {
                pr=arr[i];
            }
        }

        System.out.println("Max : "+max+ " "+ "SecondMax : "+ " " +pr);
    }
}
