public class Zoo {
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
        if (animalCount >= animals.length) {
            return false;                    // no free cage
        }
        animals[animalCount] = animal;       // put the animal in the next free cell
        animalCount++;                       // move the counter forward
        return true;
    }
}