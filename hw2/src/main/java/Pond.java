import animals.interfaces.Swim;
import animals.model.Fish;
import animals.model.Racoon;
import animals.model.Tiger;

public class Pond {

    public Pond() {
    }

    Swim[] floating = new Swim[]{new Racoon(), new Tiger(), new Fish()};

    public Swim[] getFloating() {
        return floating;
    }


}


