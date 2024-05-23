package com.example.cassandra_springboot.repositories;
import com.example.cassandra_springboot.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;
public interface ProductRepository extends CassandraRepository<Product, UUID>{
    List<Product> findByNameContaining(String keyword);
}
