package product.windows;

import product.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a windows button");
    }
}
