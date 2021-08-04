package presentation.factory;

abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}

public class PizzaFactory extends BasePizzaFactory{
    @Override
    public  Pizza createPizza(String type){
        Pizza pizza;
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }	
}
