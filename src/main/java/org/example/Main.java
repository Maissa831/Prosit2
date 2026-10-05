public class Main {
    public static void main(String[] args) {

        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 4, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);
        Animal panda = new Animal("Ursidae", "Po", 8, true);
        Animal elephantCopy = new Animal("Elephantidae", "Dumbo", 10, true);

        Zoo myZoo = new Zoo("Safari Park", "Sousse", 3);

        // Rule 1: no duplicates
        System.out.println("Add elephant     : " + myZoo.addAnimal(elephant));
        System.out.println("Add elephant again: " + myZoo.addAnimal(elephant));
        System.out.println("Add elephantCopy  : " + myZoo.addAnimal(elephantCopy));

        // Rule 2: no more than the capacity
        System.out.println("Add penguin       : " + myZoo.addAnimal(penguin));
        System.out.println("Add giraffe       : " + myZoo.addAnimal(giraffe));
        System.out.println("Add panda         : " + myZoo.addAnimal(panda));

        myZoo.displayAnimals();
    }
}
// Instruction 6: After adding parameterized constructors, the default constructors are no longer available, so new Animal() and new Zoo() cannot be used without arguments.
// Instruction 8: println(myZoo) and println(myZoo.toString()) display Zoo@hashcode because the default toString() method inherited from Object is being used.