package animal;

import ediable.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    public String howToEat(){
        return "Could be fried";
    }
}
