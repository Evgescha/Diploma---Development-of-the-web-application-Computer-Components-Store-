package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Product;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProductService extends CrudService<Product> {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }

    public List<Product> findByNameContains(String name) {
        return repository.findByNameContains(name);
    }

    public List<Product> findByDescription(String description) {
        return repository.findByDescription(description);
    }

    public List<Product> findByDescriptionContains(String description) {
        return repository.findByDescriptionContains(description);
    }

    public List<Product> findByImage(String image) {
        return repository.findByImage(image);
    }

    public List<Product> findByImageContains(String image) {
        return repository.findByImageContains(image);
    }

    public Product findByPrice(Double price) {
        return repository.findByPrice(price);
    }

    public List<Product> findByCommentsContains(com.hescha.computerstore.model.Comment comments) {
        return repository.findByCommentsContains(comments);
    }

    public Product findByDeleted(Boolean deleted) {
        return repository.findByDeleted(deleted);
    }

    public List<Product> findByCategory(Category category) {
        return repository.findByCategory(category);
    }

    public List<Product> findByCategoryAndDescriptionContains(Category category, String description) {
        return repository.findByCategoryAndDescriptionContains(category, description);
    }

    public List<Product> findByNameContainsOrDescriptionContains(String searchPhrase) {
        return repository.findByNameContainingOrDescriptionContaining(searchPhrase, searchPhrase);
    }


    public Product update(Long id, Product entity) {
        Product read = read(id);
        if (read == null) {
            throw new RuntimeException("Entity Product not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Product entity, Product read) {
        read.setName(entity.getName());
        read.setDescription(entity.getDescription());
        read.setImage(entity.getImage());
        read.setPrice(entity.getPrice());
        read.setCategory(entity.getCategory());
    }
}
