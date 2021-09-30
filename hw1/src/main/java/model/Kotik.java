package model;

public class Kotik {

    private String name;
    private int weight;
    private String meow;
    private int satiety;
    private String food;
    private static int count;

    {
        count++;
    }

    public static int getCount() {

        return count;
    }

    public Kotik(String name, int weight, String meow, int satiety) {
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }

    public Kotik() {
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public String getFood() {
        return food;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }


    public boolean eat(int satiety) {
        this.satiety += satiety;
        System.out.println("I ate");
        return true;
    }

    public boolean eat(int satiety, String food) {
        this.satiety += 3;
        System.out.println("I ate " + food);
        return true;
    }

    public boolean eat() {
        this.satiety += 2;
        System.out.println("I ate ");
        return true;
    }


    public boolean sleep() {
        if (satiety >= 0) {
            System.out.println("Cat is sleeping");
            satiety -= 1;
            return true;
        } else {
            System.out.println("I don't want to sleep. I am hungry");
        }
        return false;
    }

    public boolean chaseMouse() {
        if (satiety >= 0) {
            System.out.println("I go chase mouse");
            satiety -= 1;
            return true;
        } else {
            System.out.println("I don't want to chase a mouse. I am hungry");
        }
        return false;
    }

    public boolean play() {
        if (satiety >= 0) {
            System.out.println("I go playing");
            satiety -= 1;
            return true;
        } else {
            System.out.println("I don't want to play. I am hungry");
        }
        return false;
    }

    public boolean lickWool() {
        if (satiety >= 0) {
            System.out.println("I lick a wool");
            satiety -= 1;
            return true;
        } else {
            System.out.println("I don't want to sleep. I am hungry");
        }
        return false;
    }

    public void liveAnotherDay() {

        for (int i = 1; i < 24; i++) {
            int h = 5;
            int randomMethod = (int) (Math.random() * h) + 1;
            switch (randomMethod) {
                case 1:
                    eat();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    play();
                    break;
                case 5:
                    lickWool();
                    break;
            }
        }

    }
}
