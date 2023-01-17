package simple.factory.creators;

import simple.factory.products.NYStyleCheesePizza;
import simple.factory.products.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
