package creator.linux.style.gnome.dialog;

import creator.Dialog;
import product.Button;
import product.linux.style.gnome.button.GnomeButton;

public class GnomeDialog extends Dialog {
    @Override
    public Button createButton() {
        return new GnomeButton();
    }
}
