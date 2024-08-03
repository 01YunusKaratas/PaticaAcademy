package InsuranceManagementSystem;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String email, String password) {
        for (Account account : accounts) {
            try {
                if (account.login(email, password) == AuthenticationStatus.SUCCESS) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println("Invalid login for email: " + email);
            }
        }
        return null;
    }

    // For testing purposes
    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println(account.getUser1().getEmail());
        }
    }
}
