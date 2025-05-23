class animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class cat extends animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();   // Inherited from animal class
        d.sleep(); // Also inherited
        d.bark();  // Dog's own method

        cat c = new cat();
        c.eat();   // Inherited from animal class
        c.sleep(); // Also inherited
        c.meow();  // Cat's own method
    }
}
