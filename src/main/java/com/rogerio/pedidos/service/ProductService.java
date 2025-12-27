package com.rogerio.pedidos.service;

import com.rogerio.pedidos.model.Product;
import com.rogerio.pedidos.repository.OrderRepository;
import com.rogerio.pedidos.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public ProductService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product updateName(Long id, String name) {
        return productRepository.findById(id)
                .map(existing -> {
                    existing.setName(name);
                    return productRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + id));
    }

    public void deleteProduct(Long id) {
        // Verificar se o produto existe
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + id));

        // Verificar se o produto está associado a algum pedido
        boolean isAssociatedWithOrder = orderRepository.findAll().stream()
                .anyMatch(order -> order.getProducts().stream()
                        .anyMatch(p -> p.getId().equals(id)));

        if (isAssociatedWithOrder) {
            throw new RuntimeException("Não é permitido deletar um produto que está associado a um pedido");
        }

        productRepository.deleteById(id);
    }
}

