package presentation.factory;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }	
}

class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}

class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}