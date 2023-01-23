package creator;

import product.windows.button.WindowsButton;
import product.Button;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
