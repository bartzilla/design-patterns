package factory.method.creators;

import factory.method.products.ChicagoStyleCheesePizza;
import factory.method.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
