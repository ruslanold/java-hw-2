import java.util.ArrayList;

public class Animal {
    private ArrayList<String> foods = new ArrayList<>();
    private String animalName;
    private double latitude;
    private double longitude;

    public Animal() {}

    public Animal(ArrayList<String> foods, double latitude, double longitude, String animalName) {
        this.foods = foods;
        this.animalName = animalName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public ArrayList<String> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void makeNoise() {
        System.out.println(this.animalName + "make noise");
    }

    public void eat() {
        for (String food : this.foods) {
            System.out.println("i am eating " + food);
        }
    }

    public void sleep() {
        System.out.println(this.animalName + "sleeping");
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return " (" + this.latitude + ", " + this.longitude + ")";
    }



}

