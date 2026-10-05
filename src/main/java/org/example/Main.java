public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 4, false);
        Animal giraffe = new Animal("Giraffidae", "Melman", 6, true);

        Zoo myZoo = new Zoo("Safari Park", "Sousse", 20);

        myZoo.displayZoo();
        // directly
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(elephant);
        System.out.println(elephant.toString());
    }
}
// Instruction 6: After adding parameterized constructors, the default constructors are no longer available, so new Animal() and new Zoo() cannot be used without arguments.
// Instruction 8: println(myZoo) and println(myZoo.toString()) display Zoo@hashcode because the default toString() method inherited from Object is being used.