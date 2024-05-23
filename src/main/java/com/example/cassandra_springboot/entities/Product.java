package com.example.cassandra_springboot.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Table("products")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product {
    @PrimaryKey
    private UUID id;
    private String name;
    private double price;
    private int quantiteStock;


}