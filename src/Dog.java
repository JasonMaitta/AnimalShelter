abstract class Dog implements AdoptableAnimal {
    private final String name;
    private String description;
    private double price;

    public Dog(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract String getBreedName();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}