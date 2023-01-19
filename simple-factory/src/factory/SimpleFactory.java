package factory;

import enumarator.ProductEnum;
import product.Chair;
import product.Furniture;
import product.Sofa;
import product.Table;

public class SimpleFactory {

    public Furniture createFurniture(ProductEnum product) {

        switch (product) {
            case CHAIR:
                return new Chair();
            case SOFA:
                return new Sofa();
            case TABLE:
                return new Table();
        }

        throw new RuntimeException("No product available");
    }

}
