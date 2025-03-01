package OOP.Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();


    }
}

class Animall{
    void eat(){System.out.println("eating...");}
}
class Dogh extends Animall{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dogh{
    void weep(){System.out.println("weeping...");}

    @Override
    void bark(){
        System.out.println("Slow barking");
    }
}
