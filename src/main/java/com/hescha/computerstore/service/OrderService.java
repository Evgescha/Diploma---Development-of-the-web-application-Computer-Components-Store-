package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Order;
import com.hescha.computerstore.model.OrderStatus;
import com.hescha.computerstore.repository.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
public class OrderService extends CrudService<Order> {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                                            public Order findByOwner(User owner) {
                return repository.findByOwner(owner);
            }
                                                                    public List<Order> findByOrderitemsContains(com.hescha.computerstore.model.OrderItem orderitems) {
                return repository.findByOrderitemsContains(orderitems);
            }
                                                public Order findByCreated(LocalDateTime created) {
                return repository.findByCreated(created);
            }
                                                public Order findByStatus(OrderStatus status) {
                return repository.findByStatus(status);
            }
            

    public Order update(Long id, Order entity) {
        Order read = read(id);
        if(read == null){
            throw new RuntimeException("Entity Order not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Order entity, Order read) {
                                    read.setOwner(entity.getOwner());
                                                read.setOrderitems(entity.getOrderitems());
                                                read.setCreated(entity.getCreated());
                                                read.setStatus(entity.getStatus());
                        }
}
