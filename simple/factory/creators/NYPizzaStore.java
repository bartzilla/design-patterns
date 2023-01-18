package simple.factory.creators;

import simple.factory.pizza.CheesePizza;
import simple.factory.pizza.ClamPizza;
import simple.factory.pizza.Pizza;
import simple.factory.pizza.style.newyork.NYPizzaIngredientFactory;
import simple.factory.pizza.ingredients.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
