package com.hescha.computerstore.service;

import com.hescha.computerstore.model.User;
import com.hescha.computerstore.repository.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService extends CrudService<User>
        implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public List<User> findByUsernameContains(String username) {
        return repository.findByUsernameContains(username);
    }

    public List<User> findByPassword(String password) {
        return repository.findByPassword(password);
    }

    public List<User> findByPasswordContains(String password) {
        return repository.findByPasswordContains(password);
    }

    public List<User> findByFirstname(String firstname) {
        return repository.findByFirstname(firstname);
    }

    public List<User> findByFirstnameContains(String firstname) {
        return repository.findByFirstnameContains(firstname);
    }

    public List<User> findByLastname(String lastname) {
        return repository.findByLastname(lastname);
    }

    public List<User> findByLastnameContains(String lastname) {
        return repository.findByLastnameContains(lastname);
    }

    public List<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<User> findByEmailContains(String email) {
        return repository.findByEmailContains(email);
    }

    public List<User> findByImage(String image) {
        return repository.findByImage(image);
    }

    public List<User> findByImageContains(String image) {
        return repository.findByImageContains(image);
    }

    public List<User> findByAddress(String address) {
        return repository.findByAddress(address);
    }

    public List<User> findByAddressContains(String address) {
        return repository.findByAddressContains(address);
    }

    public List<User> findByRolesContains(com.hescha.computerstore.model.Role roles) {
        return repository.findByRolesContains(roles);
    }

    public List<User> findByOrdersContains(com.hescha.computerstore.model.Order orders) {
        return repository.findByOrdersContains(orders);
    }


    public User update(Long id, User entity) {
        User read = read(id);
        if (read == null) {
            throw new RuntimeException("Entity User not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(User entity, User read) {
        read.setUsername(entity.getUsername());
        read.setPassword(entity.getPassword());
        read.setFirstname(entity.getFirstname());
        read.setLastname(entity.getLastname());
        read.setEmail(entity.getEmail());
        read.setImage(entity.getImage());
        read.setAddress(entity.getAddress());
        read.setRoles(entity.getRoles());
        read.setOrders(entity.getOrders());
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), List.of());
    }
}
