package com.Inventory.inventory_sys.Repository;

import com.Inventory.inventory_sys.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {
}
