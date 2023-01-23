import creator.GUIFactory;
import product.Button;
import product.Checkbox;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
