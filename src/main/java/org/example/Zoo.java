public class Zoo {
    static final int MAX_ANIMALS = 25;
    Animal[] animals;
    String name;
    String city;
    static final int nbrCages=25;
    int animalCount = 0;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public boolean isZooFull() {  //15
        return animalCount >= MAX_ANIMALS || animalCount >= nbrCages;
    }

    // 16
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
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
            return false;
        }
        if (isZooFull()) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
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

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;                          // animal not in the zoo
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];           // shift left
        }
        animals[animalCount - 1] = null;           // clear the last used cell
        animalCount--;
        return true;
    }
}