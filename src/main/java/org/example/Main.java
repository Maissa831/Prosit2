public class Main {
    public static void main(String[] args) {

        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 4, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);
        Animal panda = new Animal("Ursidae", "Po", 8, true);

        Zoo myZoo = new Zoo("Safari Park", "Sousse", 3);

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(penguin);
        myZoo.addAnimal(giraffe);
        myZoo.displayAnimals();

        System.out.println("Remove elephant      : " + myZoo.removeAnimal(elephant));
        System.out.println("Remove elephant again: " + myZoo.removeAnimal(elephant));
        myZoo.displayAnimals();

        // A cage is free again, so the panda can now be added
        System.out.println("Add panda             : " + myZoo.addAnimal(panda));
        myZoo.displayAnimals();
    }
}
// Instruction 6: After adding parameterized constructors, the default constructors are no longer available, so new Animal() and new Zoo() cannot be used without arguments.
// Instruction 8: println(myZoo) and println(myZoo.toString()) display Zoo@hashcode because the default toString() method inherited from Object is being used.