package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepo orderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public OrderItem getOrderItemById(Long productId) {
        return orderItemRepository.findById(productId).orElse(null);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public OrderItem updateOrderItem(Long productId, OrderItem updatedOrderItem) {
        if (orderItemRepository.existsById(productId)) {
            updatedOrderItem.setProductId(productId);
            return orderItemRepository.save(updatedOrderItem);
        }
        return null;
    }

    public void deleteOrderItem(Long productId) {
        orderItemRepository.deleteById(productId);
    }
}
