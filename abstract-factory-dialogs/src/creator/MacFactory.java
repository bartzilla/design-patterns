package creator;

import product.Button;
import product.Checkbox;
import product.mac.MacButton;
import product.mac.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
