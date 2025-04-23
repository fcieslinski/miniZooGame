import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal z1 = new Dog("Reksio", 10, 3);
        animalList.add(z1);
        Animal z2 = new Dog("Albert", 23, 5);
        animalList.add(z2);
        Animal z3 = new Cat("Mruczek", 9, 1);
        animalList.add(z3);

        for(Animal current : animalList) {
            current.printInfo();
        }
        z1.attack(z2);
        z2.attack(z3);
        z3.attack(z2);

    }
}
