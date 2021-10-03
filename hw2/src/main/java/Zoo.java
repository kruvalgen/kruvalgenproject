import food.Food;
import food.model.Carrot;
import food.model.MeatBall;
import animals.model.*;

public class Zoo {
    public static void main(String[] args) {

        Worker worker = new Worker();
        Pony pony = new Pony("Pony","Igogo");
        Elephant elephant = new Elephant("Dendy","Thruuu");
        Duck duck = new Duck("Villy","Kua");
        Fish fish = new Fish("Voopy");
        Racoon racoon = new Racoon("Toby","Whii");
        Tiger tiger = new Tiger("Khan","Grrr");

        Food carrot = new Carrot();
        Food meatBall = new MeatBall();

        Pond pond = new Pond();

        pond.swimmers(tiger);





    }
}
