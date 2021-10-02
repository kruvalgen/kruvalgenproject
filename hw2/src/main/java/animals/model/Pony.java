package animals.model;

import Food.Food;
import animals.Animal;
import animals.Herbivore;
import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Pony extends Herbivore implements Run, Voice {


    private String voice;

    public Pony(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Pony" + " say: " + voice ;
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void run() {

    }

    @Override
    public String voice() {

        return null;
    }
}
