package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {

        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 4, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);
        Animal panda = new Animal("Ursidae", "Po", 8, true);

        Zoo myZoo = new Zoo("Safari Park", "Sousse");
        Zoo zoo2 = new Zoo("Tunis Zoo", "Tunis");

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(penguin);
        myZoo.addAnimal(giraffe);
        zoo2.addAnimal(panda);

        myZoo.displayAnimals();

        System.out.println("Remove elephant      : " + myZoo.removeAnimal(elephant));
        System.out.println("Remove elephant again: " + myZoo.removeAnimal(elephant));

        System.out.println("Is myZoo full? " + myZoo.isZooFull());
        System.out.println("Bigger zoo: " + Zoo.compareZoo(myZoo, zoo2).getName());

        elephant.setAge(-5);
        myZoo.setName("");
    }
}