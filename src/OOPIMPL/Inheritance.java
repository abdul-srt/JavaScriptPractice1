package OOPIMPL;

public class Inheritance {
    public static void main(String[] args) {
        Child c= new Child();
        c.display();
    }
}

class  Parente{

    void
    display()
    {
        System.out.println("this is parent class");
    }

    int a=10;

}

class Child extends Parente{

    void display()
    {
       super.display();
        System.out.println("Child claa");
        System.out.println(a);
    }
}