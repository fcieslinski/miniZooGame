package animals;

public abstract class Animal {
    String name;
    int hp;
    int power;
    boolean isDead = false;

    public Animal(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public void makeSound() {
        System.out.print(name + ": ");
    }

    public void printInfo() {
        System.out.printf(
                "I'm %s %s. I have %d health points and %d points of power.%n",
                getClass().getSimpleName(), name, hp, power
        );
    }

    public void attack(Animal target) {
        if(isDead) {
            System.out.println(target.name + "is already dead. There's no point in attacking.");
        }
        int damage = this.power;
        target.hp -= damage;
        System.out.println(this.name + " is attacking " + target.name);
        if(target.hp <= 0) {
            System.out.println(target.name + " was defeated by" + this.name);
            target.isDead = true;
        } else {
            System.out.println(target.name + " lost " + damage +
                    " hp. Only " + target.hp + " HP left.");
        }
    }
}
