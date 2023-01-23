package product.mac;

import product.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Mac Button");
    }
}
