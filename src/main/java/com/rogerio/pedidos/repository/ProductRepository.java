package com.rogerio.pedidos.repository;

import com.rogerio.pedidos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

