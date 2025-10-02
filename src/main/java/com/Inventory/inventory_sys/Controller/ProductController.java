package com.Inventory.inventory_sys.Controller;

import com.Inventory.inventory_sys.Entity.Product;
import com.Inventory.inventory_sys.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @PostMapping("/dispatch/{id}")
    public ResponseEntity<Product> dispatchProduct(@PathVariable Long id, @RequestParam int quantity) {
        return ResponseEntity.ok(productService.dispatchProduct(id, quantity));
    }
}
