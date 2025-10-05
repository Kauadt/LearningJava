import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:sqlite:my_database.db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

    /*
     * public static Connection conexaoGenerica(String url, String user, String
     * password) {
     * try {
     * return DriverManager.getConnection(url, user, password);
     * } catch (SQLException e) {
     * System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
     * return null;
     * }
     * }
     * 
     */

}
