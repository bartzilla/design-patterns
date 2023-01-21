package creator.chair;

import enumarator.Type;
import product.chair.artdeco.ArtDecoKitchenChair;
import product.chair.Chair;
import product.chair.artdeco.ArtDecoOfficeChair;
import product.chair.artdeco.ArtDecoLivingRoomChair;

public class ArtDecoChairFactory extends ChairFactory {

    @Override
    Chair createChair(Type style) {

        switch (style) {
            case KITCHEN:
                return new ArtDecoKitchenChair();
            case LIVING_ROOM:
                return new ArtDecoLivingRoomChair();
            case OFFICE:
                return new ArtDecoOfficeChair();
        }

        throw new RuntimeException("No product available");
    }
}
