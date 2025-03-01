package OOP.Inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {

            Mammal dog = new Mammal("Dog");
            Bird sparrow = new Bird("Sparrow");

            dog.makeSound();     // Output: Mammal sound
            sparrow.makeSound(); // Output: Bird sound
        }


    }



class LivingBeing {
    String name;

    LivingBeing(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Mammal extends LivingBeing {
    Mammal(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Mammal sound");
    }
}

class Bird extends LivingBeing {
    Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bird sound");
    }
}


