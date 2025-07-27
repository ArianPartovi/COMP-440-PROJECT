import java.sql.*;

public class JDBC_connect {

    // ✅ This method must be added for your GUI to work
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user_auth", "root", "password");  // your actual password
    }

    public static void main(String[] args) {
        try {
            Connection connection = getConnection();  // uses the method above
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

