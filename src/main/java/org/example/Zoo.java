public class Zoo {
    static final int MAX_ANIMALS = 25;
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount = 0;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo name : " + name);
        System.out.println("City     : " + city);
        System.out.println("Cages    : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null) {
            return false;                                  // nothing to add
        }
        if (animalCount >= MAX_ANIMALS || animalCount >= animals.length) {
            return false;                                  // zoo is full
        }
        if (searchAnimal(animal) != -1) {
            return false;                                  // animal already in the zoo
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("  [" + i + "] " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
}