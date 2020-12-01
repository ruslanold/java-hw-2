import java.util.ArrayList;

public class Cat extends Animal{

    private String voice = "Meow";

    public Cat() {
    }

    public Cat(ArrayList<String> foods, double latitude, double longitude, String animalName) {
        super(foods, latitude, longitude, animalName);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.voice);
        super.makeNoise();
    }
}
