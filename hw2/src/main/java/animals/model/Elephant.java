package animals.model;

import animals.Carnivorous;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Elephant extends Carnivorous implements Voice, Run, Swim {

    private  String name;
    private String voice;

    public Elephant() {
    }

    public Elephant(String name, String voice) {
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
    public String voice() {
        return getVoice();
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
