import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionData {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        Statement state = null;
        String search = "SELECT * FROM student";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            state = connect.createStatement();

            ResultSet resultSet = state.executeQuery(search);

            while (resultSet.next()) {
                int student_id = resultSet.getInt("student_id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int note = resultSet.getInt("note");

                System.out.printf("%-10d %-10s %-10s %-10d %n", student_id, name, surname, note);

            }

            state.close();
            sc.close();
            connect.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
