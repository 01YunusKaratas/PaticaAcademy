import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Database {

    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {

        Connection connect = null;
        Statement state = null;

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // state = (Statement) connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            // ResultSet.CONCUR_READ_ONLY);

            // Database calll
            // String query = "SELECT * FROM student";
            // String insert = "INSERT INTO student(name,surname,note)VALUES('ÖMER
            // TEKİN','YAVUZ',89)";
            // String insert2 = "INSERT INTO
            // student(name,surname,note)VALUES('HÜLYA','KARATAŞ',53)";
            // String delete3 = "DELETE FROM student WHERE student_id =11";

            // System.out.println(state.executeUpdate(insert));
            // System.out.println(state.executeUpdate(insert2));
            // System.out.println(state.executeUpdate(delete3));
            // bunda bir dönderme yani ekrana birşey yazdırma yok
            // ekleme,silme,update etme var

            // ResultSet resultSet = state.executeQuery(query);
            // executeQueryde dönderiyoruz sadece

            /*
             * while (resultSet.next()) {// sıradaki satırları oku der sonrada kapatırız .
             * int student_id = resultSet.getInt("student_id");
             * String name = resultSet.getString("name");
             * String surname = resultSet.getString("surname");
             * int note = resultSet.getInt("note");
             * 
             * // Kolon adları ve verileri düzenleyerek yazdırma
             * System.out.printf("%-10d %-10s %-10s %-6d %n", student_id, name, surname,
             * note);
             * }
             */
            Scanner sc = new Scanner(System.in);

            String del = "DELETE FROM student WHERE student_id = ?";

            PreparedStatement prts = connect.prepareStatement(del);

            prts.setInt(1, 15);
            prts.executeUpdate();

            prts.close();
            connect.close();
            sc.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
