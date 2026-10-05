public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Belvedere Zoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];
    }
}
// Instruction 6: After adding parameterized constructors, the default constructors
// are no longer available, so new Animal() and new Zoo() cannot be used without arguments.