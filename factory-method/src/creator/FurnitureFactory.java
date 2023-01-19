package creator;

import enumarator.ProductEnum;
import product.Furniture;

public abstract class FurnitureFactory {

    public void orderFurniture(ProductEnum product) {
        final Furniture furniture = createFurniture(product);

        furniture.printDescription();
    }
    abstract Furniture createFurniture(ProductEnum product);

}
