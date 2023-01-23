package creator;

import product.windows.button.WindowsButton;
import product.Button;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
