package factory.method.creators;

import factory.method.products.NYStyleCheesePizza;
import factory.method.products.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
