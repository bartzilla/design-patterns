package simple.factory.pizza.ingredients;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public String[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
