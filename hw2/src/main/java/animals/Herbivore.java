package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {

        if(food instanceof Grass){
            System.out.println("Animal ate");
        }else{
            System.out.println("This animal herbivore and eat only grass");
        }
    }

}
