package PatikaStore;

import java.util.ArrayList;

public abstract class device {
    private String id;
    private String name;
    private int discount;
    private int stock;
    // private Store store;
    private int inch;
    private int battery;
    private int ram;
    private String color;
    private int storage;
    private String storeBrand;

    // Constructor
    public device(String id, String name, int discount, int stock, String storeBrand, int inch, int battery, int ram,
            String color, int storage) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.stock = stock;
        this.storeBrand = storeBrand;
        this.inch = inch;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
        this.storage = storage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %s, Name: %s, Discount: %d, Stock: %d, Store Brand: %s, Inch: %d, Battery: %d, RAM: %d, Color: %s, Storage: %d",
                getId(), getName(), getDiscount(), getStock(), getStoreBrand(), getInch(), getBattery(), getRam(),
                getColor(), getStorage());
    }

    /**
     * @return String return the storeBrand
     */
    public String getStoreBrand() {
        return storeBrand;
    }

    /**
     * @param storeBrand the storeBrand to set
     */
    public void setStoreBrand(String storeBrand) {
        this.storeBrand = storeBrand;
    }

}
