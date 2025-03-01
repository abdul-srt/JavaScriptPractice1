package OOPIMPL;


interface a
{
    void display();
    int x=10;

}
interface b
{
    void display();
    int x=12;

}

public class MultipleInheritance implements a,b {

    public static void main(String[] args) {
          MultipleInheritance a=new MultipleInheritance();
          a.display();
    }
    public void display()
    {
        System.out.println(b.x);
    }
}


