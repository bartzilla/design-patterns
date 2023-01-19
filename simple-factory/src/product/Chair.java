package product;

public class Chair implements Furniture {
    private final String name;

    public Chair() {
        name = "Chair";
    }

    @Override
    public void printDescription() {
        System.out.println("This furniture is a : " + this.name);
    }
}
