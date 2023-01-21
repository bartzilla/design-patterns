package creator;

import product.WindowsButton;
import product.Button;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
