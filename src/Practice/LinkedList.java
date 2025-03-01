package Practice;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }

    }
    Node head;
    Node last;
    void addNode(int data)
    {
        Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
            last=newnode;

        }
        else {
            last.next = newnode;

            last = newnode;
        }
    }

    void reverse()
    {
        Node pre=null;
        Node curr=head;

        while (curr!=null)
        {
            Node next=curr.next;
            curr.next=pre;

            pre=curr;
            curr=next;
        }
        head=pre;

    }


    void display()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addNode(12);
        a.addNode(13);
        a.addNode(14);
        a.addNode(15);
        a.reverse();
        a.display();
    }
}
