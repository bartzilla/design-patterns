package product.chair;

public abstract class Chair {
    protected String type;
    protected String style;
    public void printDescription() {
        System.out.println("Chair Type: " + type);
        System.out.println("Chair Style: " + style + "\n");
    }
}
