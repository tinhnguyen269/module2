import animal.Chicken;
import animal.Animal;
import animal.Tiger;

import edible.Edible;

import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal i : animals) {
            System.out.println(i.makeSound());

            if (i instanceof Chicken) {
                Edible edible = (Chicken) i;
                System.out.println(edible.howToEat());
            }

        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit j : fruits ){
            System.out.println(j.howToEat());
        }





    }
}
