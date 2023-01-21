package creator.chair;

import enumarator.Type;
import product.chair.Chair;
import product.chair.artdeco.ArtDecoKitchenChair;
import product.chair.artdeco.ArtDecoLivingRoomChair;
import product.chair.artdeco.ArtDecoOfficeChair;
import product.chair.victorian.VictorianKitchenChair;
import product.chair.victorian.VictorianLivingRoomChair;
import product.chair.victorian.VictorianOfficeChair;

public class VictorianChairFactory extends ChairFactory {
    @Override
    Chair createChair(Type style) {
        switch (style) {
            case KITCHEN:
                return new VictorianKitchenChair();
            case LIVING_ROOM:
                return new VictorianLivingRoomChair();
            case OFFICE:
                return new VictorianOfficeChair();
        }

        throw new RuntimeException("No product available");
    }
}
