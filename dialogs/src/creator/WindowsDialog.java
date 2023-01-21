package creator;

import product.WindowsButton;
import product.Button;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
