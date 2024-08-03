package InsuranceManagementSystem;

import java.util.Scanner;

public class LoginHandler {

    private AccountManager accountManager;

    public LoginHandler(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public Account handleLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your email: ");
        String email = scanner.nextLine().trim();

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine().trim();

        Account account = accountManager.login(email, password);

        if (account != null) {
            System.out.println("Login successful!");
            return account;
        } else {
            System.out.println("Login failed!");
            return null;
        }
    }
}
