package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{


    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Animal ate");
        }else{
            System.out.println("This animal carnivorous and eat only meat");
        }
    }
}
