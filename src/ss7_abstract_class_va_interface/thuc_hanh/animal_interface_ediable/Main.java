package ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable;

import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.animal.Animal;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.animal.Chicken;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.animal.Tiger;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.edible.Edible;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.fruit.Apple;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.fruit.Fruit;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            animal.makeSound();

            if(animal instanceof Chicken){
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }

        System.out.println();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
