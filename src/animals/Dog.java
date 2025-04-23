package animals;

public class Dog extends Animal{

    public Dog(String name, int hp, int power) {
        super(name, hp, power);
    }

    @Override
    public void makeSound() {
        System.out.println("Hau hau!");
    }
}
