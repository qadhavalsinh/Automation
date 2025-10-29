abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Parent obj1 = new FirstSubclass();
        obj1.message();  
        Parent obj2 = new SecondSubclass();
        obj2.message();  
    }
}