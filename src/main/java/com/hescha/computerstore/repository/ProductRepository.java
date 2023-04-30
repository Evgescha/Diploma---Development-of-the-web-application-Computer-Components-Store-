package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);

    List<Product> findByNameContainingOrDescriptionContaining(String searchPhrase, String searchPhrase2);
}
