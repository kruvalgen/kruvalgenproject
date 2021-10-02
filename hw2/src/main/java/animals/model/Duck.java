package animals.model;

import Food.Food;
import animals.Herbivore;
import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    private String voice;

    @Override
    public String toString() {
        return "Duck" +
                " say: " + voice ;
    }

    public Duck(String voice) {
        this.voice = voice;
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void fly() {

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
