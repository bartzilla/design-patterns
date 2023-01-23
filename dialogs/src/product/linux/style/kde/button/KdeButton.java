package product.linux.style.kde.button;

import product.Button;

public class KdeButton implements Button {
    @Override
    public void render() {
        System.out.println("I'm rendering a Linux button KDE style");
    }

    @Override
    public void onClick() {
        System.out.println("On-click event for Linux button KDE Style");
    }
}
