package PatikaStore;

public class phone extends device {

    private String camera;

    // constructor
    public phone(String id, String name, int discount, int stock, String storeBrand, int inch, int battery, int ram,
            String color, int storage, String camera) {
        super(id, name, discount, stock, storeBrand, inch, battery, ram, color, storage);
        this.camera = camera;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Camera: %s", camera);
    }

}
