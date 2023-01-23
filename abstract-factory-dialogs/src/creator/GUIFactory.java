package creator;

import product.Button;
import product.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
