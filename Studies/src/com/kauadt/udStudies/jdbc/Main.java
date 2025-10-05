import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = ConnectionDB.connect()) {
            ProductDAO productDAO = new ProductDAO(connection);

            showProducts(productDAO);

            Product product1 = new Product("Notebook", 10, 1999.99, "Em estoque");
            Product product2 = new Product("Smartphone", 20, 1499.99, "Estoque baixo");
            Product product3 = new Product("Tablet", 15, 799.99, "Estoque baixo");

            productDAO.add(product1);
            productDAO.add(product2);
            productDAO.add(product3);

            showProducts(productDAO);

            Product productFound = productDAO.findById(1);
            if (productFound != null) {
                System.out.println("Produto encontrado: " + productFound.getName());
            } else {
                System.out.println("Produto não encontrado.");
            }

        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
        }
    }

    private static void showProducts(ProductDAO productDAO) {
        List<Product> products = productDAO.listAll();
        if (products.isEmpty()) {
            System.out.println("Nenhum produto encontrado");
            return;
        }
        products.forEach(p -> System.out.println(p.getId() + ": " + p.getName() + " - " + p.getPrice()));
    }
}
