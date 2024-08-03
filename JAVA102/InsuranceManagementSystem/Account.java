package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    private User user1;
    private ArrayList<Insurance> insurances;
    private AuthenticationStatus status;

    public Account(User user1) {
        this.user1 = user1;
        this.insurances = new ArrayList<>();
        this.status = AuthenticationStatus.FAIL; // Default olarak FAIL yapalım.
    }

    public AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException {
        if (user1.getEmail().equals(email) && user1.getPassword().equals(password)) {
            this.status = AuthenticationStatus.SUCCESS;
            return this.status;
        } else {
            throw new InvalidAuthenticationException("Invalid email or password");
        }
    }

    public void showUserInfo() {
        System.out.println(user1.toString());
    }

    public void addUserAddress(Address address) {
        user1.getAddress().add(address);
    }

    public void removeUserAddress(Address address) {
        user1.getAddress().remove(address);
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public abstract void addInsurancePolicy(Insurance insurance);

    @Override
    public int compareTo(Account other) {
        return this.user1.getEmail().compareTo(other.getUser1().getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(user1.getEmail());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return Objects.equals(user1.getEmail(), account.user1.getEmail());
    }

}
