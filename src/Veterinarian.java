import java.util.ArrayList;

public class Veterinarian {

    public Veterinarian() {
    }

    void treatAnimal(Animal animal) {
        ArrayList<String> foods = animal.getFoods();
        String name = animal.getAnimalName();
        String location = animal.getLocation();
        System.out.println("animalName: " + name);
        for (String food: foods) {
            System.out.println(name + " food: " + food);
        }
        System.out.println("location: " + location);

    }
}
