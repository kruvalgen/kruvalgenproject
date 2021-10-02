package animals.model;

import Food.Food;
import animals.Carnivorous;
import animals.interfaces.Swim;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void swim() {

    }
}
