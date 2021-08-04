package presentation.abstractfactory;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }	
}

class CheesePizza extends Pizza {
    BaseToppingFactory toppingFactory;
    
    public CheesePizza(BaseToppingFactory toppingFactory){
        this.toppingFactory=toppingFactory;
    }
    
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}

class VeggiePizza extends Pizza {
	BaseToppingFactory toppingFactory;
	
	public VeggiePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}

	@Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}