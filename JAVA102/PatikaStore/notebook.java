package PatikaStore;

public class notebook extends device {

    public notebook(String id, String name, int discount, int stock, String storeBrand, int inch, int battery, int ram,
            String color, int storage) {
        super(id, name, discount, stock, storeBrand, inch, battery, ram, color, storage);

    }

    @Override
    public String toString() {

        return super.toString();
    }
}
