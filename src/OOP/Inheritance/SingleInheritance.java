package OOP.Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog(4,"Moti","Domestic");
        Dog dd=new Dog(4,"Goti","Domestic");

        d.show();
        dd.show();

    }
}
class Animal{
    int legs;
    String name;
    String type;


    Animal(int legs,String name,String type)
    {
        this.name=name;
        this.legs=legs;
        this.type=type;
    }

}
class Dog extends Animal{

    Dog(int legs, String name, String type) {
        super(legs, name, type);
    }

    void show()
    {
        System.out.println(name+" "+this.type+" "+this.legs);

    }



}