import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private final Connection CONNECTION_DB;

    public ProductDAO(Connection connection) {
        this.CONNECTION_DB = connection;
    }

    public void add(Product product) {
        String query = "INSERT INTO products (name_product, quantity, price, status) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = CONNECTION_DB.prepareStatement(query)) {
            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getQuantity());
            stmt.setDouble(3, product.getPrice());
            stmt.setString(4, product.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    public void deleteAll() {
        String query = "DELETE * FROM products";
        try (PreparedStatement stmt = CONNECTION_DB.prepareStatement(query)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir todos os produtos: " + e.getMessage());
        }
    }

    public Product findById(int id) {
        String query = "SELECT * FROM products WHERE id_product = ?";
        try (PreparedStatement stmt = CONNECTION_DB.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rSet = stmt.executeQuery()) {
                if (rSet.next()) {
                    Product product = new Product();
                    product.setId(rSet.getInt("id_product"));
                    product.setName(rSet.getString("name_product"));
                    product.setQuantity(rSet.getInt("quantity"));
                    product.setPrice(rSet.getDouble("price"));
                    product.setStatus(rSet.getString("status"));
                    return product;
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao consultar por ID: " + e.getMessage());
        }
        return null;
    }

    public void update(Product product) {
        String query = "UPDATE products SET name_product = ?, quantity = ?, price = ?, status = ? WHERE id_product = ?";
        try (PreparedStatement stmt = CONNECTION_DB.prepareStatement(query)) {
            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getQuantity());
            stmt.setDouble(3, product.getPrice());
            stmt.setString(4, product.getStatus());
            stmt.setInt(5, product.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM products WHERE id_product = ?";
        try (PreparedStatement stmt = CONNECTION_DB.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir produto: " + e.getMessage());
        }
    }

    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM products";

        try (PreparedStatement stmt = CONNECTION_DB.prepareStatement(query); ResultSet rSet = stmt.executeQuery()) {
            while (rSet.next()) {
                Product product = new Product();
                product.setId(rSet.getInt("id_product"));
                product.setName(rSet.getString("name_product"));
                product.setQuantity(rSet.getInt("quantity"));
                product.setPrice(rSet.getDouble("price"));
                product.setStatus(rSet.getString("status"));
                products.add(product);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar produtos: " + e.getMessage());
        }
        return products;
    }
}
