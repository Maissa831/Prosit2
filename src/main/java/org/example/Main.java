public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 4, false);

        Zoo myZoo = new Zoo("Safari Park", "Sousse", 3);

        myZoo.addAnimal(elephant);
        myZoo.addAnimal(penguin);

        myZoo.displayAnimals();

        System.out.println("Search elephant: " + myZoo.searchAnimal(elephant));

        // Another animal identical to the first
        Animal elephantCopy = new Animal("Elephantidae", "Dumbo", 10, true);
        System.out.println("Search elephantCopy: " + myZoo.searchAnimal(elephantCopy));}
}
// Instruction 6: After adding parameterized constructors, the default constructors are no longer available, so new Animal() and new Zoo() cannot be used without arguments.
// Instruction 8: println(myZoo) and println(myZoo.toString()) display Zoo@hashcode because the default toString() method inherited from Object is being used.