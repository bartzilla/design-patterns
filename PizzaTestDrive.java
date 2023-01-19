import factory.method.creators.ChicagoPizzaStore;
import factory.method.creators.NYPizzaStore;
import factory.method.products.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        final NYPizzaStore nyPizzaStore = new NYPizzaStore();
        final ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        final Pizza ethanCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanCheesePizza.getName() + "\n");

        final Pizza joelCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + joelCheesePizza.getName() + "\n");
    }
}
