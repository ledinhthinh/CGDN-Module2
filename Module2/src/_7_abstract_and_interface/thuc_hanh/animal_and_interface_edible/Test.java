package _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible;

import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.animal_chicken_tiger.Animal;
import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.animal_chicken_tiger.Chicken;
import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.animal_chicken_tiger.Tiger;
import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.fruit_apple_orange.Apple;
import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.fruit_apple_orange.Fruit;
import _7_abstract_and_interface.thuc_hanh.animal_and_interface_edible.fruit_apple_orange.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.HowToEat());
            }
        }
        for (Fruit fruit : fruits){
            System.out.println(fruit.HowToEat());
        }
    }
}
