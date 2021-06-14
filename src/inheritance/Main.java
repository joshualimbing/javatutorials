package inheritance;

import java.awt.*;

public class Main {
    // Inheritance, Overriding, Polymorphism tutorial

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};
        Bird bird1 = new Bird();

        for (Cat cat: cats) {
            cat.hunt();
            cat.vocalize();
        }

        bird1.layEgg();
    }
}
