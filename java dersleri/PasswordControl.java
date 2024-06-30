import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "java123";
        String userName = "java";

        while (true) {
            System.out.println("Enter the username: ");
            String user = sc.nextLine();

            System.out.println("Enter the password :");
            String pass = sc.nextLine();

            if (user.equals(userName) && pass.equals(password)) {
                System.out.println("Login Successful");
                break; // Başarılı giriş, döngüden çık
            } else {
                System.out.println("Username or password is not correct, TRY again");
                System.out.println("Do you want to change the password or username? \n 1-YES 2-NO ");

                int change = sc.nextInt();
                sc.nextLine(); // Boş newline karakterini atla

                if (change == 1) {
                    while (true) {
                        System.out.println("Please enter the new password:");
                        String newpass = sc.nextLine(); // newpassword girisi

                        if (newpass.equals(password)) {
                            System.out.println(
                                    "The password could not be created, please enter another password. \n TRY AGAIN!");
                        } else {
                            password = newpass; // Şifreyi güncelle
                            System.out.println("Password successfully changed.");
                            break; // Yeni şifre oluşturuldu, döngüden çık
                        }
                    }
                } else {
                    System.out.println("No changes made.");
                }
            }
        }

        sc.close(); // Kaynakları serbest bırakmak için Scanner'ı kapat
    }
}
