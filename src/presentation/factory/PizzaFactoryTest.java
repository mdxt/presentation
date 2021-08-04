package presentation.factory;

import org.junit.jupiter.api.Test;

/*
 * The components of the factory method pattern in the context of the pizza 
 * store can be summarized as:

    Product (Pizza): Is an interface or an abstract class whose subclasses are 
    instantiated by the factory method.
    ConcreteProduct (CheesePizza, VeggiePizza): Are the 
    concrete subclasses that implement/extend Product. The factory method 
    instantiates these subclasses.
    Creator (BasePizzaFactory): Is an interface or an abstract class that 
    declares the factory method, which returns an object of type Product.
    ConcreteCreator (PizzaFactory): Is a concrete class that implements the 
    factory method to create and return a ConcreteProduct to Client.
    Client: Asks the Creator for a Product.

 * A Client that requires a ConcreteProduct does not create any object but 
 * instead asks the Creator for it. The ConcreteCreator implements the factory 
 * method to create the object transparently from the Client. As a result, the 
 * Client is not required to be aware of any ConcreteProduct and how they are 
 * created. This approach advocates the Object Oriented Programming principle 
 * “Program to an interface, not an implementation“, which leads to polymorphism,
 *  a key feature of object-oriented programming. In addition, as object 
 *  creation is centralized in the ConcreteCreator, any changes made to a 
 *  Product or any ConcreteProduct does not affect the Client.
 * */

public class PizzaFactoryTest {
    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
