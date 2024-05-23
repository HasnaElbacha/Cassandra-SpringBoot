package com.example.cassandra_springboot.services;
import com.example.cassandra_springboot.entities.Product;
import com.example.cassandra_springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        product.setId(UUID.randomUUID());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(UUID id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

    public List<Product> searchProductsByName(String keyword) {
        return productRepository.findByNameContaining(keyword);
    }
}