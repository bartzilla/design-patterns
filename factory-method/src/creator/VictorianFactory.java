package creator;

import enumarator.ProductEnum;
import product.Furniture;
import product.victorian.ChairVictorian;
import product.victorian.SofaVictorian;
import product.victorian.TableVictorian;

public class VictorianFactory extends FurnitureFactory {
    @Override
    Furniture createFurniture(ProductEnum product) {
        switch (product) {
            case CHAIR:
                return new ChairVictorian();
            case SOFA:
                return new SofaVictorian();
            case TABLE:
                return new TableVictorian();
        }

        throw new RuntimeException("No product available");
    }
}
