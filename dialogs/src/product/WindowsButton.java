package product;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("I am rendering a Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Doing an on-click windows action");
    }
}
