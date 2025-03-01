public class SecondWord {
    public static void main(String[] args) {
        String str = "This is a sample string";

        String temp = "sample";

        // Split the string into words
        String[] words = str.split(" ");

        // Print each word
        System.out.println("Words in the string:");
        for (String word : words) {
            if(word.equals(temp)){
                System.out.println("Word Found");
            }
            else{
                System.out.println("Word not Found");
            }
        }
    }
}