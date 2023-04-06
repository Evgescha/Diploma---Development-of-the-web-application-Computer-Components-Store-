package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Order;
import com.hescha.computerstore.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
                    Order findByOwner(User owner);
                    List<Order> findByOrderitemsContains(com.hescha.computerstore.model.OrderItem orderitems);
        Order findByCreated(LocalDateTime created);
        Order findByStatus(OrderStatus status);
}
