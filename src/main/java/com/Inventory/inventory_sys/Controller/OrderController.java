package com.Inventory.inventory_sys.Controller;

import com.Inventory.inventory_sys.Entity.Order;
import com.Inventory.inventory_sys.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor

public class OrderController {

        private final OrderService orderService;

        @GetMapping
        public ResponseEntity<List<Order>> getAllOrders() {
            return ResponseEntity.ok(orderService.getAllOrders());
        }

        @PostMapping
        public ResponseEntity<Order> addOrder(@RequestBody Order order) {
            return ResponseEntity.ok(orderService.saveOrder(order));
        }
    }
