package creator;

import product.Button;
import product.Checkbox;
import product.windows.WinButton;
import product.windows.WinCheckbox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
