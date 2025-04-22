package animals;

public abstract class Animal {
    String name;
    int hp;
    int power;

    public Animal(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public abstract void makeSound();

    public void printInfo() {
        System.out.printf(
                "I'm %s %s. I have %d health points and %d points of power.%n",
                getClass(), name, hp, power
        );
    }

    public void attack(Animal target) {
        int damage = this.power;
        target.hp -= damage;
        if(target.hp <= 0) {
            System.out.println(target.name + " was defeated by" + this.name);
        } else {
            System.out.println(target.name + " lost" + damage +
                    " hp. Only " + target.hp + "HP left.");
        }
    }
}
