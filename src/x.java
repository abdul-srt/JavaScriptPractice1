interface Interface1 {
    void method1();
}

interface Interface2 {
    void method1();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 fff");
    }


}

 class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();

    }
}
