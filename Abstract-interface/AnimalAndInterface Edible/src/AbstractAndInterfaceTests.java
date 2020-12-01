import animal.Animal;
import animal.Tiger;
import animal.Chicken;
import edible.Edible;
import Fruit.Fruit;
import Fruit.Orange;
import Fruit.Apple;



public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];

        animal[0] = new Tiger();
        animal[1] = new Chicken();

        for (Animal animal1 : animal){
            System.out.println(animal1.makeSound());

            if (animal1 instanceof Chicken){
                Edible edible = (Chicken) animal1;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];

        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }

    }
}
