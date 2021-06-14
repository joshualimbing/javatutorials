package inheritance;

public class HouseCat extends Cat{

    @Override
    public void vocalize(){
        System.out.println("Meow!");
    }

    public void hunt() {
        System.out.println("Not hunting...");
    }
}
