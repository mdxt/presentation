package presentation.builder;

import org.junit.jupiter.api.*;

/*
 * The GoF Builder pattern has four components: the Director, 
 * the Builder (interface), the ConcreteBuilder (implementation), 
 * and the Product.
 * 
 * In this case,
 * Director -> ConstructionEngineer
 * Builder interface -> HouseBuilder
 * Builder implementation -> ConcreteHouseBuilder, PrefabricatedHouseBuilder
 * Product -> House
 * 
 * For the simplified Bloch version (implemented in Book.java),
 * Builder implementation -> Book.Builder
 * Product -> Book
 * Its essentially a way to have named params in Java
 */

public class ConstructionEngineerTest {
	
	@Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }
}