package PatikaStore;

import java.util.Scanner;

public class User {

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome to Patika Store*****");

        // Store instance creation
        Store store = new Store("Patika Store");

        while (true) {
            System.out.println("""
                                -----------------------------------------------
                                    PatikaStore Product Management Panel
                    1-Phone transactions
                    2-Notebook transactions
                    3-Brand transactions
                    4-EXIT
                                -----------------------------------------------
                    """);

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    handlePhoneTransactions(store);
                    break;
                case 2:
                    handleNotebookTransactions(store);
                    break;
                case 3:
                    handleBrandTransactions(store);
                    break;
                case 4:
                    System.out.println("Exıtıng Program ...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void handlePhoneTransactions(Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1-Add Phone
                2-Delete Phone
                3-Show List
                4-EXIT
                """);
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                store.addPhone();
                break;
            case 2:
                store.removePhone();
                break;
            case 3:
                store.showPhones();
                break;
            case 4:
                System.out.println("Go to Main ...");

                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void handleNotebookTransactions(Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1-Add Notebook
                2-Delete Notebook
                3-Show Notebook
                4-EXIT
                """);
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                store.addNotebook();
                break;
            case 2:
                store.removeNotebook();
                break;
            case 3:
                store.showNotebooks();
                break;
            case 4:
                System.out.println("Go to Main ...");

                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void handleBrandTransactions(Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1-Add Brand
                2-Delete Brand
                3-Show Brands
                4-EXIT
                """);
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                store.addBrand();
                break;
            case 2:
                store.removeBrand();
                break;
            case 3:
                store.showBrands();
                break;
            case 4:
                System.out.println(" Go to Main ...");

                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
