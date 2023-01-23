package product.linux.style.gnome.button;

import product.Button;

public class GnomeButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Linux button GNOME Style");
    }

    @Override
    public void onClick() {
        System.out.println("On-click event for Linux button GNOME Style");
    }
}
