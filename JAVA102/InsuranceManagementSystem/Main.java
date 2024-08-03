package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Address> addresses = new ArrayList<>();
        // Address instances
        Address homeAddress = new HomeAddress("Ankara", "1234 Elm Street", "06510");
        Address businessAddress = new BusinessAddress("Istanbul", "5678 Oak Avenue", "34000");

        // User instance
        addresses.add(homeAddress);
        addresses.add(businessAddress);

        User user1 = new User("yunus emre", "karataş", "yunuskaratas589@gmail.com", "password123", "Engineer", 30,
                addresses, new Date());

        // Account instances
        Account individualAccount = new Individual(user1);
        Account enterpriseAccount = new Enterprise(user1);

        // AccountManager instance
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        // Print all accounts for verification
        accountManager.printAccounts();

        // Attempt to login
        LoginHandler loginHandler = new LoginHandler(accountManager);
        Account loggedInAccount = loginHandler.handleLogin();

        // If login is successful, show user info
        if (loggedInAccount != null) {
            loggedInAccount.showUserInfo();
        }
    }
}
