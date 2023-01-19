import enumarator.ProductEnum;
import factory.SimpleFactory;
import product.Furniture;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        System.out.println("----------- Welcome to Furniture Factory -----------\n");

        SimpleFactory simpleFactory = new SimpleFactory();

        final Furniture furniture = simpleFactory.createFurniture(ProductEnum.TABLE);
        furniture.printDescription();
    }
}