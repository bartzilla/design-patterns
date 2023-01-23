import creator.GUIFactory;
import creator.MacFactory;
import creator.WinFactory;

public class Main {
    public static void main(String[] args) {
        final String config = "Mac";
        GUIFactory factory = null;

        if (config.equals("Windows")) {
            factory = new WinFactory();
        } else if (config.equals("Mac")) {
            factory = new MacFactory();
        }

        final Application app = new Application(factory);
        app.createUI();
        app.paint();

    }
}