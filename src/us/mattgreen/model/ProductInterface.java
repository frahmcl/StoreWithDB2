package us.mattgreen.model;
import java.util.List;

public interface ProductInterface
{
    List<Product> getAllProducts();
    Product getProductByName(String name);
    List<Product> searchProducts(String search);
    Product getSingleProduct(int itemNum);
    void addContent();
    void deleteContent();
    void updateContent();
}
