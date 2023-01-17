package simple.factory.creators;

import simple.factory.products.ChicagoStyleCheesePizza;
import simple.factory.products.NYStyleCheesePizza;
import simple.factory.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
