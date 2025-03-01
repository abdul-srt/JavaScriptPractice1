public class NonRepeatedChar {
    public static void main(String[] args) {
        String S="AASDSS";
        for(int i=0;i<S.length();i++)
        {   boolean flag=true;
            for(int j=0;j<S.length();j++)
            {
                if(i!=j && S.charAt(i)==S.charAt(j))
                {
                    flag=false;
                }

            }
            if(flag)
            {
                System.out.println(S.charAt(i));
            }
        }

    }


    }