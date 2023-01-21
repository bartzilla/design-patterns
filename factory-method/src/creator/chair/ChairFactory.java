package creator.chair;

import enumarator.Type;
import product.chair.Chair;

public abstract class ChairFactory {

    public void orderChair(Type style) {
        final Chair chair = createChair(style);

        chair.printDescription();
    }
    abstract Chair createChair(Type product);

}
