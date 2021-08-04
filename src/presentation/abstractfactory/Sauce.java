package presentation.abstractfactory;

public interface Sauce {
    void prepareSauce();
}

class TomatoSauce implements Sauce {
    public TomatoSauce(){
        prepareSauce();
    }
     @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce..");
    }
}

class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce..");
    }
}
