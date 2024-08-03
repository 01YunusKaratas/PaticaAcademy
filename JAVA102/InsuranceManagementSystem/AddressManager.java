package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

// Adres ekleme ,cıkarma,silme gibi işlemleri yapıcaz bu sınıfta.
public class AddressManager {

    private static User user1;

    public AddressManager(User user1) {

        this.user1 = user1; // create user object.

    }

    public static void addAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the  Cıty :");
        String cıty = sc.nextLine().trim().toUpperCase();
        System.out.println("Please enter the  FulAddres :");
        String full = sc.nextLine().trim();
        System.out.println("Please enter the  PostalCode :");
        String code = sc.nextLine().trim();

        System.out.println("Is this a Home Address or Business Address? (Enter 'home' or 'business'):");
        String addressType = sc.nextLine().trim().toLowerCase();

        Address address;
        if (addressType.equals("home")) {
            address = new HomeAddress(cıty, full, code);
            System.out.println("Addres is added in Home Address");
        } else if (addressType.equals("business")) {
            address = new BusinessAddress(cıty, full, code);
            System.out.println("Addres is added in Business Address");
        } else {
            System.out.println("pLease enter the valid address!!!");
            return;
        }

        user1.getAddress().add(address);
        System.out.println("Address added successfuly " + address.toString());

    }

    public static void deleteAddres() {
        Scanner sc = new Scanner(System.in);

        int i;

        System.out.println("********************ADDRESSES********************");
        ArrayList<Address> addresses = user1.getAddress(); // Adress arraylisttindeki bilgikleri buraya attık

        for (i = 0; i < addresses.size(); i++) {
            Address a1 = addresses.get(i);
            System.out.println((i + 1) + " -> " + a1);
        }

        System.out.println("Which address do you wanna remove ?  : ");
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < addresses.size()) {
            Address remove = addresses.get(index);

            user1.getAddress().remove(remove);
            System.out.println("Address deleted .");
        } else {
            System.out.println("Please enter the correct value !!!");

        }

    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

}