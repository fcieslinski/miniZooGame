package animals;

public class Cat extends Animal{
    public Cat(String name, int hp, int power) {
        super(name, hp, power);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Miau miau!");
    }
}
