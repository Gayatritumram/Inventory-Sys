package com.Inventory.inventory_sys.Service;

import com.Inventory.inventory_sys.Entity.Order;
import com.Inventory.inventory_sys.Entity.Product;
import com.Inventory.inventory_sys.Repository.OrderRepo;
import com.Inventory.inventory_sys.Repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public Product dispatchProduct(Long productId, int quantity) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getQuantity() < quantity) {
            throw new RuntimeException("Insufficient stock");
        }

        product.setQuantity(product.getQuantity() - quantity);
        productRepo.save(product);

        Order order = new Order();
        order.setProduct(product);
        order.setQuantity(quantity);
        order.setOrderDate(LocalDateTime.now());
        orderRepo.save(order);

        return product;
    }
}
