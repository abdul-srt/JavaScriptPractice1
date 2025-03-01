public class ReplaceSpecialChar {
    public static void main(String[] args) {

        String S="         BA*@ hj hkk ";
        String ans=S.replaceAll("[^0-9a-zA-Z]","");
        System.out.println("repalce all "+ans);
        removevoid(S);
        trim(S);


        regix(S);
    }

    static void removevoid( String S){
        System.out.println(S.strip());

    }
    static void trim(String S){
        System.out.println(S.trim());
    }
    static void regix(String S)
    {
        System.out.println(S.replaceAll("\\s",""));
    }

}
