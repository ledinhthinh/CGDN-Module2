package _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.animal_chicken_tiger;

import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.Edible;
import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.animal_chicken_tiger.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck cluck!";
    }

    @Override
    public String HowToEat() {
        return "could be fried";
    }
}
