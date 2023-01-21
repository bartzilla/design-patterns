import creator.chair.ArtDecoChairFactory;
import creator.chair.ChairFactory;
import creator.chair.VictorianChairFactory;
import enumarator.Type;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryMethodTest {
    public static void main(String[] args) {

        System.out.println("----------- Welcome to Furniture Factory Method -----------\n");

        final ArrayList<ChairFactory> chairFactories = new ArrayList<>();
        chairFactories.add(new ArtDecoChairFactory());
        chairFactories.add(new VictorianChairFactory());

        final ChairFactory artDecoChairFactory = new ArtDecoChairFactory();
        Arrays.asList(Type.values()).forEach(artDecoChairFactory::orderChair);

        final ChairFactory victorianChairFactory = new VictorianChairFactory();
        Arrays.asList(Type.values()).forEach(victorianChairFactory::orderChair);
    }
}