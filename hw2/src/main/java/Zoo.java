import Food.Food;
import Food.model.Carrot;
import animals.Animal;
import animals.interfaces.Run;
import animals.model.*;

public class Zoo {
    public static void main(String[] args) {
        Worker alex = new Worker();
        Animal pony = new Pony("Igogo");
        Animal duck = new Duck("Kria");
        Animal elephant = new Elephant("THRUU");
        Animal racoon = new Racoon("Skuee");
        Animal tiger = new Tiger("GRRR");
        Food carrot = new Carrot();

        alex.getVoice(pony);
        alex.getVoice(duck);
        alex.getVoice(elephant);
        alex.getVoice(racoon);
        alex.getVoice(tiger);





    }
}
