package BuildingFactory;

interface Building {
    void build();
}

class Castle implements Building {
    @Override
    public void build() {
        System.out.println("Castle has been built.");
    }
}

class Barracks implements Building {
    @Override
    public void build() {
        System.out.println("Barracks have been built.");
    }
}

public class BuildingFactory {
    public Building createBuilding(String type) {
        switch (type.toLowerCase()) {
            case "castle":
                return new Castle();
            case "barracks":
                return new Barracks();
            default:
                throw new IllegalArgumentException("Unknown building type: " + type);
        }
    }


}

