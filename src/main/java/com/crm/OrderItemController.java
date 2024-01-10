package com.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/order-items")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @GetMapping("/{productId}")
    public OrderItem getOrderItemById(@PathVariable Long productId) {
        return orderItemService.getOrderItemById(productId);
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.createOrderItem(orderItem);
    }

    @PutMapping("/{productId}")
    public OrderItem updateOrderItem(@PathVariable Long productId, @RequestBody OrderItem updatedOrderItem) {
        return orderItemService.updateOrderItem(productId, updatedOrderItem);
    }

    @DeleteMapping("/{productId}")
    public void deleteOrderItem(@PathVariable Long productId) {
        orderItemService.deleteOrderItem(productId);
    }
}
