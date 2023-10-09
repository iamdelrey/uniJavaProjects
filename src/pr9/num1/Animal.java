package pr9.num1;

public class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}