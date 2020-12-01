import java.util.ArrayList;

public class Dog extends Animal {

    private String voice = "Woof";

    public Dog() {
    }

    public Dog(ArrayList<String> foods, double latitude, double longitude, String animalName) {
        super(foods, latitude, longitude, animalName);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.voice);
        super.makeNoise();
    }
}
