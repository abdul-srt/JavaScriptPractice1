package Stack;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack <Integer>s=new Stack<>();
        s.push(10);
        s.push(11);
        System.out.println(s.peek());
        System.out.println(s.stream());
    }
}
