package Practice;

import java.util.Arrays;

public class Queu{

    static class Node{
     int data;
     Node next;

     Node(int data){
         this.data=data;
         next=null;
     }
    }

    Node head;
    Node rear;
    void offer(int data)
    {
        Node newnode =new Node(data);
        if(head==null)
        {
            head=newnode;
            rear=newnode;
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
        }
    }
    void poll()
    {
        int data=head.data;
        head=head.next;
        System.out.println("Poll data form Queue :"+data);
    }

    void display()
    {
        Node t=head;
        while (t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }



    public static void main(String[] args) {
        Queu q= new Queu();
        q.offer(1);
        q.offer(2);

        q.offer(3);

        q.offer(4);
        q.poll();

        q.display();
    }
}


class QueueWarray{

  static int arr[]=new int[10];


    int i=-1;
    int f=0;

    void add(int data)
    {
        i++;
        arr[i]=data;
    }

    void poll()
    {
        for(int i=0;i<3;i++)
        {
            arr[i]=arr[i+1];
        }

    }


    public static void main(String[] args) {
        QueueWarray qa=new QueueWarray();
        qa.add(1);
        qa.add(2);
        qa.add(3);
        qa.add(4);

        qa.poll();

        System.out.println(Arrays.toString(arr));
    }



















}