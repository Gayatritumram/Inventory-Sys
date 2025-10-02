package com.Inventory.inventory_sys.Repository;

import com.Inventory.inventory_sys.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
