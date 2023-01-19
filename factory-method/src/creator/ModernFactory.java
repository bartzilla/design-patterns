package creator;

import enumarator.ProductEnum;
import product.Furniture;
import product.modern.ChairModern;
import product.modern.SofaModern;
import product.modern.TableModern;

public class ModernFactory extends FurnitureFactory{
    @Override
    Furniture createFurniture(ProductEnum product) {
        switch (product) {
            case CHAIR:
                return new ChairModern();
            case SOFA:
                return new SofaModern();
            case TABLE:
                return new TableModern();
        }

        throw new RuntimeException("No product available");
    }
}
