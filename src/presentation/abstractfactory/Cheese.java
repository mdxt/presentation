package presentation.abstractfactory;

public interface Cheese {
	void prepareCheese();
}

class GoatCheese implements Cheese {
    public  GoatCheese(){
       prepareCheese();
    }
    @Override
    public void prepareCheese(){
        System.out.println("Preparing goat cheese...");
    }
}

class MozzarellaCheese implements Cheese{
    public  MozzarellaCheese(){prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
