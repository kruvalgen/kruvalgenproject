import model.Kotik;

public class Application {

    public static void main(String[] args) {

        Kotik kotik1 = new Kotik("Max ", 10, "MOOU", 5);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Bill");
        kotik2.setWeight(12);
        kotik2.setMeow("MIAU");

        kotik1.liveAnotherDay();
        System.out.println("I am " + kotik1.getName());
        System.out.println("My weight " + kotik1.getWeight());
        System.out.println(kotik1.getMeow().equals(kotik2.getMeow()));
        System.out.println(Kotik.getCount());

    }
}
