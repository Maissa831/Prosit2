package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {

        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal pingu = new Animal("Spheniscidae", "Pingu", 4, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);
        Animal panda = new Animal("Ursidae", "Po", 8, true);

        Zoo myZoo = new Zoo("Safari Park", "Sousse");
        Zoo zoo2 = new Zoo("Tunis Zoo", "Tunis");

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(pingu);
        myZoo.addAnimal(giraffe);
        zoo2.addAnimal(panda);

        myZoo.displayAnimals();

        System.out.println("Remove elephant      : " + myZoo.removeAnimal(elephant));
        System.out.println("Remove elephant again: " + myZoo.removeAnimal(elephant));

        System.out.println("Is myZoo full? " + myZoo.isZooFull());
        System.out.println("Bigger zoo: " + Zoo.compareZoo(myZoo, zoo2).getName());

        elephant.setAge(-5);
        myZoo.setName("");

        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        Aquatic aquatic2 = new Aquatic("Generic", "Aqua", 3, false, "Lake");
        Terrestrial terrestrial2 = new Terrestrial("Felidae", "Leo", 5, true, 4);
        Dolphin dolphin2 = new Dolphin("Delphinidae", "Flipper", 8, true, "Ocean", 35.5f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingu", 4, false, "Antarctic", 120.0f);

        System.out.println(aquatic2);
        System.out.println(terrestrial2);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        aquatic2.swim();
        dolphin2.swim();
        penguin2.swim();
    }
}