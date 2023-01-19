package creator;

import enumarator.ProductEnum;
import product.Furniture;
import product.artdeco.ChairArtDeco;
import product.artdeco.SofaArtDeco;
import product.artdeco.TableArtDeco;

public class ArtDecoFactory extends FurnitureFactory {

    @Override
    Furniture createFurniture(ProductEnum product) {
        switch (product) {
            case CHAIR:
                return new ChairArtDeco();
            case SOFA:
                return new SofaArtDeco();
            case TABLE:
                return new TableArtDeco();
        }

        throw new RuntimeException("No product available");
    }
}
