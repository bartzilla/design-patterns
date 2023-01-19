import creator.ArtDecoFactory;
import creator.FurnitureFactory;
import creator.ModernFactory;
import creator.VictorianFactory;
import enumarator.ProductEnum;

public class FactoryMethodTest {
    public static void main(String[] args) {

        System.out.println("----------- Welcome to Furniture Factory Method -----------\n");

        final FurnitureFactory artDecoFactory = new ArtDecoFactory();
        final FurnitureFactory victorianFactory = new VictorianFactory();
        final ModernFactory modernFactory = new ModernFactory();

        artDecoFactory.orderFurniture(ProductEnum.SOFA);
        victorianFactory.orderFurniture(ProductEnum.SOFA);
        modernFactory.orderFurniture(ProductEnum.SOFA);

    }
}