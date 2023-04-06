package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Order;
import com.hescha.computerstore.model.OrderItem;
import com.hescha.computerstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
                    OrderItem findByOrder(Order order);
                    OrderItem findByProduct(Product product);
        OrderItem findByCount(Integer count);
}
