package product.windows;

import product.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Windows Checkbox");
    }
}
