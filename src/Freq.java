import java.util.Arrays;

public class Freq {
    public static void main(String[] args) {
        String a="AA AAA AA BB AA";
        String sub="AA";
        int count=0;
        String arr[]= a.split(" ");
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i].equals(sub))
          {
              count++;
          }
        }
        System.out.println(count);
    }
}
