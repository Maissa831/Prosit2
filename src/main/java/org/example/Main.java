public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 4, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);
        Animal lion = new Animal("Felidae", "Simba", 5, true);

        Zoo myZoo = new Zoo("Safari Park", "Sousse", 3);

        System.out.println("Add lion : " + myZoo.addAnimal(elephant));
        System.out.println("Add tiger: " + myZoo.addAnimal(penguin));
        System.out.println("Add eagle: " + myZoo.addAnimal(giraffe));
        System.out.println("Add bear : " + myZoo.addAnimal(lion));
    }
}
// Instruction 6: After adding parameterized constructors, the default constructors are no longer available, so new Animal() and new Zoo() cannot be used without arguments.
// Instruction 8: println(myZoo) and println(myZoo.toString()) display Zoo@hashcode because the default toString() method inherited from Object is being used.