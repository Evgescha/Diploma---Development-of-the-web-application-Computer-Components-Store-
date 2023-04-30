package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Order;
import com.hescha.computerstore.model.Role;
import com.hescha.computerstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByOrdersContains(Order orders);
}
