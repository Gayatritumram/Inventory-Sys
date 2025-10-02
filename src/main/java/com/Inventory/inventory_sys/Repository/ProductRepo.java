package com.Inventory.inventory_sys.Repository;

import com.Inventory.inventory_sys.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
