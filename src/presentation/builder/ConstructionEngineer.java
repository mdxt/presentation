package presentation.builder;

public class ConstructionEngineer {
    private HouseBuilder houseBuilder;
    public ConstructionEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.paintHouse();
        houseBuilder.furnishHouse();
        return houseBuilder.getHouse();
    }
}
