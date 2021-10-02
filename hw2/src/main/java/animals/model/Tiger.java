package animals.model;

import Food.Food;
import animals.Carnivorous;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    private String voice;

    @Override
    public String toString() {
        return "Tiger" + voice;
    }

    public Tiger(String voice) {
        this.voice = voice;
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String voice() {
        return null;
    }
}
