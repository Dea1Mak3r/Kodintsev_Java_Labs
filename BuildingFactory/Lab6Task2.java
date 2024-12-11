package BuildingFactory;

public class Lab6Task2 {
    public static void main(String[] args)
    {
        BuildingFactory factory = new BuildingFactory();
        Building castle = factory.createBuilding("castle");
        Building barracks = factory.createBuilding("barracks");

        castle.build();
        barracks.build();
    }
}
