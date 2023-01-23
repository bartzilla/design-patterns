package creator.linux.style.kde.dialog;

import creator.Dialog;
import product.Button;
import product.linux.style.kde.button.KdeButton;

public class KdeDialog extends Dialog {
    @Override
    public Button createButton() {
        return new KdeButton();
    }
}
