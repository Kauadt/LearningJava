import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try (Connection connection = ConnectionDB.connect()) {
            Statement stmt = connection.createStatement();

            String query = "CREATE TABLE products (" +
                    "id_product INTEGER PRIMARY KEY," +
                    "name_product TEXT NOT NULL," +
                    "quantity INTEGER," +
                    "price REAL," +
                    "status TEXT" +
                    ")";
            System.out.println(query);

            stmt.execute(query);
            System.out.println("Tabela 'Produtos' criada com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao criar a tabela: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
