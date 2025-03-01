package Stack;

public class StackUsingArray {
    public static void main(String[] args) {
        ArrayStack as=new ArrayStack();
        as.push(10);
        as.push(11);
        as.push(12);


        as.pop();


        System.out.println(as.peek());




    }
}
class ArrayStack{

    int s[]=new int[3];
    int top=-1;

    boolean push(int data)
    {
        if(top<s.length-1)
        {

            s[++top]=data;
            return true;
        }
        else{
            throw new RuntimeException("Oh no StacK Over Flow");

        }

    }
    int pop()
    {
        if(top==-1)
        {
            throw new RuntimeException("oh no stack underflow...");
        }
        else{
            int d=s[top];

            top--;
            return d;
        }
    }
    int peek()
    {
        return s[top];
    }




}