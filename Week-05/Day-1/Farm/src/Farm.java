import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {


    List<Animal> animals;
    int slots;

    public Farm (){
        this.animals = new ArrayList<>();
        slots = 3;
    }
    public Farm(List<Animal> animals, int slots) {
        this.animals = new ArrayList<>();
        this.slots = slots;
    }

    public void breed(){
        if (slots > 0){
            animals.add(new Animal());
        }
    }

    public List<Animal> slaughter(){
        Animal theLeastHungryAnimal= animals.get(0);

        for (Animal animal:animals) {
            if (animal.hunger< theLeastHungryAnimal.hunger){
                theLeastHungryAnimal = animal;
            }
        }
        animals.remove(theLeastHungryAnimal);
        return animals;
    }

    public static void main(String[] args) {
        Farm theHacienda = new Farm();
        theHacienda.breed();
        theHacienda.breed();
        theHacienda.animals.forEach(System.out::println);
        theHacienda.breed();
        theHacienda.animals.forEach(System.out::println);


    }
}
