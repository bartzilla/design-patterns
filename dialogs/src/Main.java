import creator.Dialog;
import creator.WebDialog;
import creator.WindowsDialog;

public class Main {
    public static void main(String[] args) {
        String config = "Windows";
        Dialog dialog = null;

        if (config.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (config.equals("Web")) {
            dialog = new WebDialog();
        }

        dialog.render();
    }
}