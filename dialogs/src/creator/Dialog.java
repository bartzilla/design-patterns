package creator;

import product.Button;

public abstract class Dialog {
    abstract Button createButton();

    public void render() {
        final Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
}
