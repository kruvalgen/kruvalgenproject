package animals.model;

import food.Food;
import animals.Herbivore;
import animals.interfaces.Fly;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Duck extends Herbivore implements Voice, Run, Fly, Swim {

    private String name;
    private String voice;

    public Duck(String name) {
        this.name = name;
    }

    public Duck(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }


    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void fly() {
        System.out.println("Duck flying very good");
    }

    @Override
    public void run() {
        System.out.println("Duck runs very funny");

    }

    @Override
    public void swim() {
        System.out.println("Duck swims best of all");
    }

    @Override
    public String voice() {
        return getVoice();
    }
}
