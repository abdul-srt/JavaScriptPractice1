import java.util.HashSet;
import java.util.Scanner;
public class Application12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sentenceCount(s));
    }
    private static int sentenceCount(String s) {
        String[] w = s.trim().split("\\s+");
        for(int i=0;i<w.length;i++) {

            System.out.println(w[i]);
        }
        int ans=0;
        for(int i=0;i<w.length;i++) {
            String k = w[i];
            int len = k.length();
            if(k.lastIndexOf('!')==(len-1) || k.lastIndexOf('?')==(len-1) ) {
                ans++;
            }else if(k.equals(".")) {
                ans++;
            }else if(len>1) {
                if(k.charAt(len-1)=='.'&&k.charAt(len-2)=='.') {
                    ans++;
                }
            }else {
            }
        }
        return ans;
    }

    public static class HashsetDuplicate {
        public static void main(String[] args) {
            System.out.println(con());
        }
        static int con()
        {
            int arr[] = {1, 2, 3, 4};
            HashSet<Integer> h = new HashSet<>();
            int count = -1;
            for (int a : arr) {
                if (!h.add(a)) {
                    count += 1;

                }

            }
            if(count==-1)
            {
                return count;
            }
            return count+=1;
        }

    }
}