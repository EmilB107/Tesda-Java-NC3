/*
    Create a gorilla class which implements the Animal interface.
    Add this comment inside appropriate methods:
    // lather, rinse, repeat
    // pet at your own risk
    // put gorilla food into cage
*/
package chapter6.task16;

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(false);
        gorilla.groom();
        gorilla.pet();
    }
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla...");
            return true;
        }
        System.out.println("It's not time to feed the gorilla yet.");
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla...");
    }
}