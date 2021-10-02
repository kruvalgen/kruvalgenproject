import Food.Food;
import animals.Animal;
import animals.interfaces.Voice;
import animals.model.Pony;

public class Worker {


    public void feed(Food food, Animal animal) {
        System.out.println("I fed ");

    }

    public void getVoice(Animal animal) {
        System.out.println("Animal " + animal);
    }

}
