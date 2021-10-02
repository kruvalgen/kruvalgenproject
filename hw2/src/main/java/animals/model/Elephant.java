package animals.model;

import Food.Food;
import animals.Herbivore;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Elephant extends Herbivore implements Swim, Voice, Run {

    private String voice;

    @Override
    public String toString() {
        return "Elephant" +
                " say: " + voice;
    }

    public Elephant(String voice) {
        this.voice = voice;
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

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
