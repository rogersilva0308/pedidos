package com.rogerio.pedidos.service;

import com.rogerio.pedidos.model.Order;
import com.rogerio.pedidos.model.Product;
import com.rogerio.pedidos.model.User;
import com.rogerio.pedidos.repository.OrderRepository;
import com.rogerio.pedidos.repository.ProductRepository;
import com.rogerio.pedidos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    public Order save(Order order) {
        // Validar se o usuário existe
        User user = userRepository.findById(order.getUser().getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com id: " + order.getUser().getId()));

        // Validar e carregar os produtos
        List<Product> products = order.getProducts().stream()
                .map(p -> productRepository.findById(p.getId())
                        .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + p.getId())))
                .toList();

        order.setUser(user);
        order.setProducts(products);

        return orderRepository.save(order);
    }

    public void delete(Long id) {
        throw new RuntimeException("Não é permitido deletar um pedido");
    }
}

