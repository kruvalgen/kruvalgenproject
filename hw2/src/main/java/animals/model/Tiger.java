package animals.model;

import food.Food;
import animals.Carnivorous;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Tiger extends Carnivorous implements Swim, Run, Voice {

    private String name;
    private String voice;


    public Tiger() {

    }

    public Tiger(String name, String voice) {
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
    public void run() {
        System.out.println("Tigers like run");
    }

    @Override
    public void swim() {
        System.out.println("Tigers can swim but don't like to do it");

    }

    @Override
    public String voice() {
        return getVoice();
    }
}
