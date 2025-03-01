package Stack;

public class StackUsingLinkedlist {
    public static void main(String[] args) {
        Stackk Stack=new Stackk();
        Stack.push(10);
        Stack.push(20);

        Stack.display();

        Stackk s2=new Stackk();
        s2.push(80);
        s2.push(90);

        s2.display();
        s2.peek();



    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class Stackk{

         Node head=null;

       void push(int data) {
            Node newnode = new Node(data);


            newnode.next=head;
            head=newnode;
            System.out.println( "Pushed onto stack: "+data);


        }

         int pop()
        {
            Node x= head;
            head=head.next;
            System.out.println("item poped.........");
            return x.data ;
        }
         void display()
        {
            Node curr=head;
            while(curr!=null)
            {
                System.out.println(curr.data);
                curr=curr.next;
            }
        }

        void peek()
        {
            System.out.println("Peak of stack "+head.data);
        }

    }

