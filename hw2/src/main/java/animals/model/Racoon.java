package animals.model;

import animals.Carnivorous;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Racoon extends Carnivorous implements Swim, Voice, Run {
    private String name;
    private String voice;


    public Racoon() {
    }

    public Racoon(String name, String voice) {
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
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String voice() {
        return getVoice();
    }
}
