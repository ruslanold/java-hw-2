import java.util.ArrayList;

public class Horse extends Animal{
    private String voice = "Neigh";

    public Horse() {
    }

    public Horse(ArrayList<String> foods, double latitude, double longitude, String animalName) {
        super(foods, latitude, longitude, animalName);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.voice);
        super.makeNoise();
    }
}
