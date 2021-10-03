package animals.model;

import food.Food;
import animals.Herbivore;
import animals.interfaces.Swim;

public class Fish extends Herbivore implements Swim {

    private String name;

    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void swim() {

    }
}
