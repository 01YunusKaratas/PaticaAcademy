package InsuranceManagementSystem;

//interface 
public interface Address {

    // Tam adress
    String getFullAddress();

    // Şehir
    String getCıty();

    // Posta Code
    String getPostalCode();

    void setFullAddress(String address);

    void setCıty(String cıty);

    void setPostalCode(String postalCode);

    // toString metodu tüm adres bilgilerini döndüren bir metod olarak
    // tanımlanabilir
    @Override
    String toString();
}
