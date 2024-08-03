package InsuranceManagementSystem;

public class BusinessAddress implements Address {
    private String cıty;
    private String postalCode;
    private String address;

    // constructor
    public BusinessAddress(String cıty, String addres, String postalCode) {
        this.cıty = cıty;
        this.address = addres;
        this.postalCode = postalCode;
    }

    @Override
    public String getCıty() {

        return this.cıty;

    }

    @Override
    public String getFullAddress() {
        return this.address;

    }

    @Override
    public String getPostalCode() {
        return this.postalCode;

    }

    @Override
    public void setCıty(String cıty) {

        this.cıty = cıty;

    }

    @Override
    public void setFullAddress(String address) {
        this.address = address;

    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;

    }

    @Override
    public String toString() {
        return String.format("Business Address - City: %s, Full Address: %s, Postal Code: %s", cıty, address,
                postalCode);
    }

}
