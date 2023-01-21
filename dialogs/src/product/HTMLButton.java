package product;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("I am rendering an HTML button");
    }

    @Override
    public void onClick() {
        System.out.println("Doing an on-click html action");
    }
}
