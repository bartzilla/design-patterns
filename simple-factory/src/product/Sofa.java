package product;

public class Sofa implements Furniture {
    private final String name;

    public Sofa() {
        this.name = "Sofa";
    }

    @Override
    public void printDescription() {
        System.out.println("This furniture is a : " + this.name);
    }
}
