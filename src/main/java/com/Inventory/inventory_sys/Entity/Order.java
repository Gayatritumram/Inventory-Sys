package com.Inventory.inventory_sys.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")  // ✅ avoid reserved word
@Data                   // ✅ Lombok generates getters/setters/toString
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    private LocalDateTime orderDate = LocalDateTime.now();
}
