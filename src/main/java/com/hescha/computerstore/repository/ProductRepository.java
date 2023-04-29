package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);

    List<Product> findByNameContains(String name);

    List<Product> findByDescription(String description);

    List<Product> findByDescriptionContains(String description);

    List<Product> findByImage(String image);

    List<Product> findByCategory(Category category);

    List<Product> findByCategoryAndDescriptionContains(Category category, String description);

    List<Product> findByImageContains(String image);

    Product findByPrice(Double price);

    List<Product> findByCommentsContains(com.hescha.computerstore.model.Comment comments);

    Product findByDeleted(Boolean deleted);

    List<Product> findByNameContainingOrDescriptionContaining(String searchPhrase, String searchPhrase2);
}
