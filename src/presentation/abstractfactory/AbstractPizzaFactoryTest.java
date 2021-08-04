package presentation.abstractfactory;

import org.junit.jupiter.api.Test;

public class AbstractPizzaFactoryTest {
    @Test
    public void testCreateGourmetPizza() throws Exception {
    	BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
    
    @Test
    public void testCreateSicilianPizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("veggie");
    }
}
