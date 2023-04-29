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

    List<User> findByPassword(String password);

    List<User> findByPasswordContains(String password);

    List<User> findByFirstname(String firstname);

    List<User> findByFirstnameContains(String firstname);

    List<User> findByLastname(String lastname);

    List<User> findByLastnameContains(String lastname);

    List<User> findByEmail(String email);

    List<User> findByEmailContains(String email);

    List<User> findByImage(String image);

    List<User> findByImageContains(String image);

    List<User> findByAddress(String address);

    List<User> findByAddressContains(String address);

    List<User> findByRolesContains(Role roles);

    User findByOrdersContains(Order orders);
}
