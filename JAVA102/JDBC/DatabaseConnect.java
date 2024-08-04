import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DatabaseConnect {
    public static void main(String[] args) {

        Connection connect = null;
        String url = "jdbc:mysql://localhost/university?user=root&password=";

        try {

            connect = DriverManager.getConnection(url);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
