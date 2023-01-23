import creator.Dialog;
import creator.linux.style.gnome.dialog.GnomeDialog;
import creator.WebDialog;
import creator.WindowsDialog;
import creator.linux.style.kde.dialog.KdeDialog;

public class Main {
    public static void main(String[] args) {
        String config = "Linux";
        String style = "GNOME";
        Dialog dialog = null;

        if (config.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (config.equals("Web")) {
            dialog = new WebDialog();
        } else if (config.equals("Linux")) {

            if (style.equals("GNOME")) {
                dialog = new GnomeDialog();
            } else if (style.equals("KDE")) {
                dialog = new KdeDialog();
            }
        }

        dialog.render();
    }
}