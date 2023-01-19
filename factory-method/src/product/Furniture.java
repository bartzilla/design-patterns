package product;

public abstract class Furniture {
    protected String name;
    public void printDescription() {
        System.out.println("This furniture is a : " + this.name);
    }
}
