package PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.UUID;

public class Store implements Comparable<Store> {
    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private TreeSet<String> brands;
    private ArrayList<phone> phones;
    private ArrayList<notebook> notebooks;

    // Constructor
    public Store(String name) {
        this.id = UUID.randomUUID().toString(); // Random unique ID
        this.name = name;
        this.brands = new TreeSet<>(); // Create Set for brands
        this.phones = new ArrayList<>(); // Create List for phones
        this.notebooks = new ArrayList<>(); // Create List for notebooks
        initializeBrands();
    }

    private void initializeBrands() {
        brands.add("Samsung");
        brands.add("Lenovo");
        brands.add("Apple");
        brands.add("Huawei");
        brands.add("Casper");
        brands.add("Asus");
        brands.add("HP");
        brands.add("Xiaomi");
        brands.add("Monster");
    }

    // Add a new brand
    public void addBrand() {
        System.out.println("Please enter the brand to add:");
        String brand = sc.nextLine();
        if (brands.add(brand)) {
            System.out.println(brand + " added to the list.");
        } else {
            System.out.println(brand + " already exists in the list.");
        }
    }

    // Show the list of brands
    public void showBrands() {
        System.out.println("------Brands------");
        for (String brand : brands) {
            System.out.println(brand);
        }
    }

    // Remove a brand
    public void removeBrand() {
        this.showBrands();
        System.out.println("Please enter the brand to remove:");
        String brand = sc.nextLine();
        if (brands.remove(brand)) {
            System.out.println(brand + " removed from the list.");
        } else {
            System.out.println("Brand not found.");
        }
    }

    // Add a phone
    public void addPhone() {
        System.out.println("Enter the phone details:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Discount: ");
        int discount = sc.nextInt();

        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine(); // Consume newline

        this.showBrands();
        System.out.println("Store brand: ");
        String storeBrand = sc.nextLine();

        System.out.print("Inch: ");
        int inch = sc.nextInt();

        System.out.print("Battery: ");
        int battery = sc.nextInt();

        System.out.print("RAM: ");
        int ram = sc.nextInt();

        System.out.print("Color: ");
        sc.nextLine(); // Consume newline
        String color = sc.nextLine();

        System.out.print("Storage: ");
        int storage = sc.nextInt();

        System.out.print("Camera: ");
        sc.nextLine(); // Consume newline
        String camera = sc.nextLine();

        // UUID ile benzersiz ID oluştur
        String id = UUID.randomUUID().toString();

        // Yeni Phone nesnesi oluştur ve ArrayList'e ekle
        phone newPhone = new phone(id, name, discount, stock, storeBrand, inch, battery, ram, color, storage, camera);
        phones.add(newPhone);

        System.out.println("Phone added successfully: " + newPhone);
    }

    // Remove a phone
    public void removePhone() {
        System.out.println("Enter the phone ID:");
        String uniqueID = sc.nextLine();
        phone phoneToRemove = null;
        for (phone p : phones) {
            if (p.getId().equals(uniqueID)) {
                phoneToRemove = p;
                break;
            }
        }
        if (phoneToRemove != null) {
            phones.remove(phoneToRemove);
            System.out.println(uniqueID + " removed.");
        } else {
            System.out.println("No phone found with ID " + uniqueID);
        }
    }

    // Show phones
    public void showPhones() {
        System.out.println("------Phones------");
        for (phone p : phones) {
            System.out.println(p);
        }
    }

    // Add a notebook
    public void addNotebook() {
        System.out.println("Enter the notebook details:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Discount: ");
        int discount = sc.nextInt();

        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine(); // Consume newline

        this.showBrands();
        System.out.println("Store brand: ");
        String storeBrand = sc.nextLine();

        System.out.print("Inch: ");
        int inch = sc.nextInt();

        System.out.print("Battery: ");
        int battery = sc.nextInt();

        System.out.print("RAM: ");
        int ram = sc.nextInt();

        System.out.print("Color: ");
        sc.nextLine(); // Consume newline
        String color = sc.nextLine();

        System.out.print("Storage: ");
        int storage = sc.nextInt();

        // UUID ile benzersiz ID oluştur
        String id = UUID.randomUUID().toString();

        // Yeni Notebook nesnesi oluştur ve ArrayList'e ekle
        notebook newNotebook = new notebook(id, name, discount, stock, storeBrand, inch, battery, ram, color, storage);
        notebooks.add(newNotebook);

        System.out.println("Notebook added successfully: " + newNotebook);
    }

    // Remove a notebook
    public void removeNotebook() {
        System.out.println("Enter the notebook ID:");
        String uniqueID = sc.nextLine();
        notebook notebookToRemove = null;
        for (notebook n : notebooks) {
            if (n.getId().equals(uniqueID)) {
                notebookToRemove = n;
                break;
            }
        }
        if (notebookToRemove != null) {
            notebooks.remove(notebookToRemove);
            System.out.println(uniqueID + " removed.");
        } else {
            System.out.println("No notebook found with ID " + uniqueID);
        }
    }

    // Show notebooks
    public void showNotebooks() {
        System.out.println("------Notebooks------");
        for (notebook n : notebooks) {
            System.out.println(n);
        }
    }

    // Setter and Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeSet<String> getBrands() {
        return brands;
    }

    public void setBrands(TreeSet<String> brands) {
        this.brands = brands;
    }

    public void setPhones(ArrayList<phone> phones) {
        this.phones = phones;
    }

    public ArrayList<phone> getPhones() {
        return phones;
    }

    public void setNotebooks(ArrayList<notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public ArrayList<notebook> getNotebooks() {
        return notebooks;
    }

    @Override
    public int compareTo(Store o) {
        return this.getName().compareTo(o.getName());
    }
}
