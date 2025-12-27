package com.rogerio.pedidos.repository;

import com.rogerio.pedidos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

