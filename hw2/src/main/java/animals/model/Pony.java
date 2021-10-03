package animals.model;

import animals.Herbivore;
import animals.interfaces.Run;
import animals.interfaces.Voice;


public class Pony extends Herbivore implements Voice, Run {

    private String name;
    private String voice;

    public Pony() {
    }

    public Pony(String name, String voice) {
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
}
