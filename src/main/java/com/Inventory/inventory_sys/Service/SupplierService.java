package com.Inventory.inventory_sys.Service;

import com.Inventory.inventory_sys.Entity.Supplier;
import com.Inventory.inventory_sys.Repository.SupplierRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplierService {
    private final SupplierRepo supplierRepo;

    public Supplier addSupplier(Supplier supplier){
        return supplierRepo.save(supplier);
    }
    public List<Supplier> getAllSuppliers(){
        return supplierRepo.findAll();
    }
}
