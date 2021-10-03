import food.Food;
import animals.Animal;
import animals.interfaces.Voice;

public class Worker {

    public void feed(Food food, Animal animal){
        animal.eat(food);
    }

    public void getVoice(Voice voice){
        System.out.println("Animal say: " + voice.voice());
    }

}
