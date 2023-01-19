package product;

public class Table implements Furniture {
    private final String name;

    public Table() {
        this.name = "Table";
    }

    @Override
    public void printDescription() {
        System.out.println("This furniture is a : " + this.name);
    }
}
