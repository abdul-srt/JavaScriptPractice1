package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Stack {

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    Node top=null;
    public void push(int data)
    {

            Node newnode=new Node(data);
            newnode.next=top;
            top=newnode;


    }
    public void pop()
    {
        System.out.println(top.data);
        top=top.next;
    }

    public void diplay()
    {
        Node t=top;
        while (t!=null)
        {
            System.out.print(" "+t.data);
            t=t.next;

        }
    }


    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(5);
        s.push(4);
        s.push(3);

        s.push(2);
        s.push(1);
        s.pop();
        s.diplay();



    }

}



class StackArrayList
{
    ArrayList<Integer> stack=new ArrayList<>();


    void push(int data)
    {

        stack.add(data);
    }
    int pop()
    {
        int p;
        if(stack.size()<0)
        {
            throw new RuntimeException("Empty Stack");
        }
        else
        {
            p=stack.remove(stack.size()-1);

        }
        return p;
    }
    void dispaly()
    {
        for(int a: stack)
        {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        StackArrayList stackArrayList= new StackArrayList();
        stackArrayList.push(5);
        stackArrayList.push(4);
        stackArrayList.push(3);
        stackArrayList.push(2);
        stackArrayList.push(1);

        stackArrayList.dispaly();

        System.out.println("Pop Item :"+stackArrayList.pop());
    }
}