import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList<String> foodsCat = new ArrayList<String>();
        foodsCat.add("Milk");
        foodsCat.add("Meat");
        foodsCat.add("Mouse");

        ArrayList<String> foodsDog = new ArrayList<String>();
        foodsDog.add("Bone");
        foodsDog.add("Meat");

        ArrayList<String> foodsHorse = new ArrayList<String>();
        foodsHorse.add("Grass");
        foodsHorse.add("Apple");

        Cat cat = new Cat(foodsCat, 31.353637, 39.897688, "Caty");
        Dog dog = new Dog(foodsDog, 34.016242, 55.153020, "Sharic");
        Horse horse = new Horse(foodsHorse, 45.213004, 34.396983, "Mustang");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(horse);

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
