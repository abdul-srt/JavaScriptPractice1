package Queue;

public class QueueLinkedlist {

    public static void main(String[] args) {
        queue Q = new queue();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
        Q.display();
        System.out.println("Pop item : " + Q.pop());
        System.out.println("After Pop....");
        Q.display();


        queue w = new queue();
        w.add("Amma");
        w.add("abba");
        w.display();
    }
}

class queue {

    Node head=null;
    Node rare ;

    void add(int data) {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
            rare=head;
        }
       rare.next=newnode;
        rare=newnode;
        System.out.println("Node Add....");

    }
    void add(String data) {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
            rare=head;
        }
        rare.next=newnode;
        rare=newnode;
        System.out.println("Node Add....");

    }
    void display()
    {
        Node curr=head;
        while (curr!=null)
        {
            System.out.println(curr.sdata);
            curr=curr.next;
        }
    }

    int  pop()
    {
        int p=head.data;
        head=head.next;
        return p;
    }

    static class Node{
            int data;
            Node next;

            String sdata;

            Node(int data)
            {
                this.data=data;
                next=null;
            }
            Node (String data)
            {
                this.sdata=data;
            }
        }
}