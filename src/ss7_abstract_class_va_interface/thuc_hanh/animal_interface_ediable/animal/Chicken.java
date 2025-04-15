package ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.animal;

import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.animal.Animal;
import ss7_abstract_class_va_interface.thuc_hanh.animal_interface_ediable.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("cục tác");
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}
